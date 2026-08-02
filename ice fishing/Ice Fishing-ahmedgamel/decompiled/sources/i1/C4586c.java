package i1;

import A1.C0261c;
import A1.E;
import A1.H;
import A1.x;
import A1.y;
import O.C0336f;
import O.InterfaceC0330c;
import O2.i;
import P2.f;
import S0.l;
import Y0.o;
import android.content.ClipData;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ContentInfo;
import androidx.fragment.app.AbstractComponentCallbacksC0479s;
import androidx.fragment.app.K;
import androidx.fragment.app.N;
import androidx.work.impl.WorkDatabase;
import b3.e;
import c6.C0555a;
import com.IceFishing.LiveIceFishing.F;
import com.IceFishing.LiveIceFishing.IntroActivity;
import com.IceFishing.LiveIceFishing.MainActivity;
import com.IceFishing.LiveIceFishing.SplashActivity;
import com.anythink.core.common.d.j;
import com.anythink.core.common.n.b.A;
import com.bumptech.glide.d;
import com.google.android.gms.internal.ads.C2964aq;
import e.C4466a;
import e.InterfaceC4467b;
import g7.n;
import g7.t;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;
import l1.AbstractC4668c;
import l3.InterfaceC4673a;
import l4.q;
import m.W;
import m6.m;
import u1.InterfaceC5063b;
import u1.h;
import u1.k;

/* renamed from: i1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4586c implements y, InterfaceC5063b, H0.b, InterfaceC0330c, InterfaceC4467b, InterfaceC4673a, o, m, W {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f38153n;

    /* renamed from: u, reason: collision with root package name */
    public Object f38154u;

    public /* synthetic */ C4586c(int i, Object obj) {
        this.f38153n = i;
        this.f38154u = obj;
    }

    @Override // Y0.o
    public void OnCall() {
        switch (this.f38153n) {
            case 15:
                super/*androidx.activity.p*/.onBackPressed();
                break;
            case 16:
                IntroActivity introActivity = ((com.IceFishing.LiveIceFishing.o) this.f38154u).f6417u;
                introActivity.startActivity(introActivity.f6269x);
                break;
            case 17:
                MainActivity mainActivity = ((com.IceFishing.LiveIceFishing.y) this.f38154u).f6437u.f6440c;
                mainActivity.startActivity(mainActivity.f6330Q);
                break;
            default:
                MainActivity mainActivity2 = ((com.IceFishing.LiveIceFishing.y) this.f38154u).f6437u.f6440c;
                mainActivity2.startActivity(mainActivity2.f6340V);
                break;
        }
    }

    @Override // O.InterfaceC0330c
    public void a(Bundle bundle) {
        ((ContentInfo.Builder) this.f38154u).setExtras(bundle);
    }

    @Override // u1.InterfaceC5063b
    public boolean c(Object obj, File file, h hVar) {
        InputStream inputStream = (InputStream) obj;
        C2964aq c2964aq = (C2964aq) this.f38154u;
        byte[] bArr = (byte[]) c2964aq.f(com.anythink.basead.exoplayer.b.aX, byte[].class);
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, read);
                    } catch (IOException e9) {
                        e = e9;
                        fileOutputStream = fileOutputStream2;
                        if (Log.isLoggable("StreamEncoder", 3)) {
                            Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e);
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        c2964aq.k(bArr);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        c2964aq.k(bArr);
                        throw th;
                    }
                }
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
                c2964aq.k(bArr);
                return true;
            } catch (IOException e10) {
                e = e10;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // m6.m
    public m d(String str) {
        ((g7.m) this.f38154u).f37691d = str;
        return this;
    }

    @Override // m6.m
    public m e(String str) {
        ((g7.m) this.f38154u).f37692e = str;
        return this;
    }

    @Override // e.InterfaceC4467b
    public void f(Object obj) {
        C4466a c4466a = (C4466a) obj;
        N n9 = (N) this.f38154u;
        K k9 = (K) n9.f4808C.pollFirst();
        if (k9 == null) {
            Log.w("FragmentManager", "No IntentSenders were started for " + this);
            return;
        }
        q qVar = n9.f4820c;
        String str = k9.f4802n;
        AbstractComponentCallbacksC0479s c9 = qVar.c(str);
        if (c9 != null) {
            c9.m(k9.f4803u, c4466a.f37186n, c4466a.f37187u);
        } else {
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    @Override // l3.InterfaceC4673a
    public Object g(l3.m mVar) {
        l lVar = (l) this.f38154u;
        if (mVar.i() || mVar.f38884d) {
            return mVar;
        }
        Exception f2 = mVar.f();
        if (!(f2 instanceof f)) {
            return mVar;
        }
        int i = ((f) f2).f2383n.f24395n;
        return (i == 43001 || i == 43002 || i == 43003 || i == 17) ? ((e) lVar.f2927v).j() : i == 43000 ? d.q(new Exception("Failed to get app set ID due to an internal error. Please try again later.")) : i != 15 ? mVar : d.q(new Exception("The operation to get app set ID timed out. Please try again later."));
    }

    @Override // O.InterfaceC0330c
    public void h(Uri uri) {
        ((ContentInfo.Builder) this.f38154u).setLinkUri(uri);
    }

    @Override // O.InterfaceC0330c
    public void i(int i) {
        ((ContentInfo.Builder) this.f38154u).setFlags(i);
    }

    @Override // A1.y
    public x j(E e9) {
        return new C0261c(1, (H) this.f38154u);
    }

    public long n() {
        return ((C0555a) this.f38154u).c();
    }

    @Override // m6.m
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public g7.q mo53build() {
        return (g7.q) ((g7.m) this.f38154u).b(new A(6));
    }

    public y8.h p(long j6) {
        return ((C0555a) this.f38154u).d((int) j6);
    }

    public Z0.A q(Context context, String str, InputStream inputStream, String str2, String str3) {
        Z0.A g9;
        EnumC4584a enumC4584a;
        if (str2 == null) {
            str2 = com.anythink.core.common.m.a.f15190q;
        }
        boolean contains = str2.contains("application/zip");
        C4585b c4585b = (C4585b) this.f38154u;
        if (contains || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            AbstractC4668c.a();
            EnumC4584a enumC4584a2 = EnumC4584a.ZIP;
            g9 = str3 != null ? Z0.m.g(context, new ZipInputStream(new FileInputStream(c4585b.t(str, inputStream, enumC4584a2))), str) : Z0.m.g(context, new ZipInputStream(inputStream), null);
            enumC4584a = enumC4584a2;
        } else if (str2.contains("application/gzip") || str2.contains("application/x-gzip") || str.split("\\?")[0].endsWith(".tgs")) {
            AbstractC4668c.a();
            enumC4584a = EnumC4584a.GZIP;
            g9 = str3 != null ? Z0.m.d(str, new GZIPInputStream(new FileInputStream(c4585b.t(str, inputStream, enumC4584a)))) : Z0.m.d(null, new GZIPInputStream(inputStream));
        } else {
            AbstractC4668c.a();
            enumC4584a = EnumC4584a.JSON;
            g9 = str3 != null ? Z0.m.d(str, new FileInputStream(c4585b.t(str, inputStream, enumC4584a).getAbsolutePath())) : Z0.m.d(null, inputStream);
        }
        if (str3 != null && g9.f3927a != null) {
            File file = new File(c4585b.p(), C4585b.l(str, enumC4584a, true));
            File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
            boolean renameTo = file.renameTo(file2);
            file2.toString();
            AbstractC4668c.a();
            if (!renameTo) {
                AbstractC4668c.b("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + j.f13164z);
            }
        }
        return g9;
    }

    public synchronized k r(Class cls) {
        int size = ((ArrayList) this.f38154u).size();
        for (int i = 0; i < size; i++) {
            K1.f fVar = (K1.f) ((ArrayList) this.f38154u).get(i);
            if (fVar.f1678a.isAssignableFrom(cls)) {
                return fVar.f1679b;
            }
        }
        return null;
    }

    public void s() {
        ((SplashActivity) this.f38154u).f6380z.postDelayed(new F(this, 0), 7000L);
    }

    public void t(int i) {
        ((C0555a) this.f38154u).k(i);
    }

    public String toString() {
        switch (this.f38153n) {
            case 22:
                return ((g7.m) this.f38154u).d(getClass().getSimpleName());
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C4586c(int i, boolean z6) {
        this.f38153n = i;
    }

    @Override // O.InterfaceC0330c
    public C0336f build() {
        ContentInfo build;
        build = ((ContentInfo.Builder) this.f38154u).build();
        return new C0336f(new n4.c(build));
    }

    public C4586c(WorkDatabase workDatabase) {
        this.f38153n = 9;
        kotlin.jvm.internal.h.e(workDatabase, "workDatabase");
        this.f38154u = workDatabase;
    }

    public C4586c(C4585b c4585b, i iVar) {
        this.f38153n = 0;
        this.f38154u = c4585b;
    }

    public C4586c(C0555a c0555a) {
        this.f38153n = 14;
        new ArrayList();
        this.f38154u = c0555a;
    }

    public C4586c(Context context) {
        boolean isEmpty;
        this.f38153n = 26;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f38154u = sharedPreferences;
        File file = new File(E.a.c(context), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    isEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (isEmpty) {
                    return;
                }
                Log.i("FirebaseMessaging", "App restored, clearing state");
                synchronized (this) {
                    sharedPreferences.edit().clear().commit();
                }
            }
        } catch (IOException e9) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e9.getMessage());
            }
        }
    }

    public C4586c(t tVar, String str) {
        this.f38153n = 22;
        this.f38154u = new g7.m(str, n.f37696n, 1, tVar);
    }

    public C4586c(int i) {
        Handler handler;
        Handler handler2;
        this.f38153n = i;
        switch (i) {
            case 5:
                Looper mainLooper = Looper.getMainLooper();
                if (Build.VERSION.SDK_INT >= 28) {
                    handler2 = K.i.a(mainLooper);
                } else {
                    try {
                        handler = (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(mainLooper, null, Boolean.TRUE);
                    } catch (IllegalAccessException e9) {
                        e = e9;
                        Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                        handler = new Handler(mainLooper);
                        handler2 = handler;
                        this.f38154u = handler2;
                        return;
                    } catch (InstantiationException e10) {
                        e = e10;
                        Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                        handler = new Handler(mainLooper);
                        handler2 = handler;
                        this.f38154u = handler2;
                        return;
                    } catch (NoSuchMethodException e11) {
                        e = e11;
                        Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                        handler = new Handler(mainLooper);
                        handler2 = handler;
                        this.f38154u = handler2;
                        return;
                    } catch (InvocationTargetException e12) {
                        Throwable cause = e12.getCause();
                        if (!(cause instanceof RuntimeException)) {
                            if (cause instanceof Error) {
                                throw ((Error) cause);
                            }
                            throw new RuntimeException(cause);
                        }
                        throw ((RuntimeException) cause);
                    }
                    handler2 = handler;
                }
                this.f38154u = handler2;
                return;
            case 6:
                this.f38154u = new ArrayList();
                return;
            case 28:
                this.f38154u = new LinkedHashSet();
                return;
            default:
                this.f38154u = new H(7);
                return;
        }
    }

    @Override // m.W
    public void k(int i) {
    }

    @Override // m.W
    public void l(int i) {
    }

    public C4586c(ClipData clipData, int i) {
        this.f38153n = 7;
        this.f38154u = D3.e.o(clipData, i);
    }

    @Override // m.W
    public void m(int i, float f2) {
    }
}
