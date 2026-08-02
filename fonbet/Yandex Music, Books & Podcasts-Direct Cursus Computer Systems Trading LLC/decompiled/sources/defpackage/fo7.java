package defpackage;

import android.os.Looper;
import android.os.Parcel;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class fo7 implements Closeable {
    public final /* synthetic */ int a;
    public Object b;

    public fo7(wnm wnmVar) {
        this.a = 3;
        this.b = wnmVar;
        Intrinsics.d(wnmVar.b.getLooper(), Looper.myLooper());
        wnmVar.f = true;
    }

    public static String g(HttpURLConnection httpURLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                    sb.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } finally {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
            }
        }
        return sb.toString();
    }

    public static fo7 o() {
        Parcel obtain = Parcel.obtain();
        fo7 fo7Var = new fo7();
        fo7Var.b = obtain;
        return fo7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0016 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String a() {
        boolean z;
        HttpURLConnection httpURLConnection = (HttpURLConnection) this.b;
        try {
            try {
            } catch (NullPointerException e) {
                e = e;
                psg.c("get error failed ", e);
                return e.getMessage();
            }
        } catch (IOException unused) {
        }
        if (httpURLConnection.getResponseCode() / 100 == 2) {
            z = true;
            if (!z) {
                return null;
            }
            try {
                return "Unable to fetch " + httpURLConnection.getURL() + ". Failed with " + httpURLConnection.getResponseCode() + StringUtil.LF + g(httpURLConnection);
            } catch (IOException e2) {
                e = e2;
                psg.c("get error failed ", e);
                return e.getMessage();
            }
        }
        z = false;
        if (!z) {
        }
    }

    public Parcel b() {
        o2g.U("get() after close()/release()", ((Parcel) this.b) != null);
        return (Parcel) this.b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.a) {
            case 0:
                ((HttpURLConnection) this.b).disconnect();
                break;
            case 1:
                ((ikn) this.b).close();
                break;
            case 2:
                Parcel parcel = (Parcel) this.b;
                if (parcel != null) {
                    parcel.recycle();
                    this.b = null;
                    break;
                }
                break;
            case 3:
                wnm wnmVar = (wnm) this.b;
                Intrinsics.d(wnmVar.b.getLooper(), Looper.myLooper());
                wnmVar.f = false;
                wnmVar.d();
                break;
            default:
                ((g78) this.b).close();
                break;
        }
    }

    public /* synthetic */ fo7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ fo7() {
        this.a = 2;
    }

    public fo7(ArrayList arrayList, ikn iknVar) {
        this.a = 1;
        this.b = iknVar;
    }
}
