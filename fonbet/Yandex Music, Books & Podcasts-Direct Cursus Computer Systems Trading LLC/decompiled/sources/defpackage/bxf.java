package defpackage;

import android.graphics.Rect;
import android.os.LocaleList;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class bxf {
    public final View a;
    public final qne b;
    public axf e;
    public qbs f;
    public aeu g;
    public Rect l;
    public final twf m;
    public uif c = vsf.y;
    public Function1 d = vsf.z;
    public ybs h = new ybs("", rds.b, 4);
    public ide i = ide.g;
    public final ArrayList j = new ArrayList();
    public final Object k = btf.a(bwf.c, new ypb(13, this));

    public bxf(View view, bh0 bh0Var, qne qneVar) {
        this.a = view;
        this.b = qneVar;
        this.m = new twf(bh0Var, qneVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final qnn a(EditorInfo editorInfo) {
        int i;
        bqg bqgVar;
        int i2;
        int i3;
        ybs ybsVar = this.h;
        String str = ybsVar.a.b;
        long j = ybsVar.b;
        ide ideVar = this.i;
        int i4 = ideVar.e;
        int i5 = ideVar.d;
        boolean z = ideVar.a;
        if (i4 != 1) {
            if (i4 == 0) {
                i = 1;
            } else if (i4 == 2) {
                i = 2;
            } else if (i4 == 6) {
                i = 5;
            } else if (i4 == 5) {
                i = 7;
            } else if (i4 == 3) {
                i = 3;
            } else if (i4 == 4) {
                i = 4;
            } else {
                if (i4 != 7) {
                    xq0.q("invalid ImeAction");
                    return null;
                }
                i = 6;
            }
            editorInfo.imeOptions = i;
            bqgVar = ideVar.f;
            if (Intrinsics.d(bqgVar, bqg.c)) {
            }
            if (i5 != 1) {
            }
            i2 = 1;
            editorInfo.inputType = i2;
            if (!z) {
            }
            i3 = editorInfo.inputType;
            if ((i3 & 1) == 1) {
            }
            int i6 = rds.c;
            editorInfo.initialSelStart = (int) (j >> 32);
            editorInfo.initialSelEnd = (int) (j & 4294967295L);
            l1b.l(editorInfo, str);
            editorInfo.imeOptions |= 33554432;
            if (qmr.a) {
            }
            l1b.m(editorInfo, false);
            vwf vwfVar = wwf.a;
            if (r3b.d()) {
            }
            qnn qnnVar = new qnn(this.h, new h4b(this), this.i.c, this.e, this.f, this.g);
            this.j.add(new WeakReference(qnnVar));
            return qnnVar;
        }
        if (!z) {
            i = 0;
            editorInfo.imeOptions = i;
            bqgVar = ideVar.f;
            if (Intrinsics.d(bqgVar, bqg.c)) {
                editorInfo.hintLocales = null;
            } else {
                ArrayList arrayList = new ArrayList(v75.o(bqgVar, 10));
                Iterator it = bqgVar.a.iterator();
                while (it.hasNext()) {
                    arrayList.add(((zpg) it.next()).a);
                }
                Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
                editorInfo.hintLocales = new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
            }
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 == 3) {
                        i2 = 2;
                    } else if (i5 == 4) {
                        i2 = 3;
                    } else if (i5 == 5) {
                        i2 = 17;
                    } else if (i5 == 6) {
                        i2 = 33;
                    } else if (i5 == 7) {
                        i2 = 129;
                    } else if (i5 == 8) {
                        i2 = 18;
                    } else {
                        if (i5 != 9) {
                            xq0.q("Invalid Keyboard Type");
                            return null;
                        }
                        i2 = 8194;
                    }
                    editorInfo.inputType = i2;
                    if (!z && (i2 & 1) == 1) {
                        editorInfo.inputType = 131072 | i2;
                        if (ideVar.e == 1) {
                            editorInfo.imeOptions |= 1073741824;
                        }
                    }
                    i3 = editorInfo.inputType;
                    if ((i3 & 1) == 1) {
                        int i7 = ideVar.b;
                        if (i7 == 1) {
                            editorInfo.inputType = i3 | 4096;
                        } else if (i7 == 2) {
                            editorInfo.inputType = i3 | RemoteCameraConfig.Notification.ID;
                        } else if (i7 == 3) {
                            editorInfo.inputType = i3 | 16384;
                        }
                        if (ideVar.c) {
                            editorInfo.inputType |= SQLiteDatabase.OPEN_NOMUTEX;
                        }
                    }
                    int i62 = rds.c;
                    editorInfo.initialSelStart = (int) (j >> 32);
                    editorInfo.initialSelEnd = (int) (j & 4294967295L);
                    l1b.l(editorInfo, str);
                    editorInfo.imeOptions |= 33554432;
                    if (qmr.a || i5 == 7 || i5 == 8) {
                        l1b.m(editorInfo, false);
                    } else {
                        l1b.m(editorInfo, true);
                        sb.x(editorInfo);
                    }
                    vwf vwfVar2 = wwf.a;
                    if (r3b.d()) {
                        r3b.a().i(editorInfo);
                    }
                    qnn qnnVar2 = new qnn(this.h, new h4b(this), this.i.c, this.e, this.f, this.g);
                    this.j.add(new WeakReference(qnnVar2));
                    return qnnVar2;
                }
                editorInfo.imeOptions |= Integer.MIN_VALUE;
            }
            i2 = 1;
            editorInfo.inputType = i2;
            if (!z) {
                editorInfo.inputType = 131072 | i2;
                if (ideVar.e == 1) {
                }
            }
            i3 = editorInfo.inputType;
            if ((i3 & 1) == 1) {
            }
            int i622 = rds.c;
            editorInfo.initialSelStart = (int) (j >> 32);
            editorInfo.initialSelEnd = (int) (j & 4294967295L);
            l1b.l(editorInfo, str);
            editorInfo.imeOptions |= 33554432;
            if (qmr.a) {
            }
            l1b.m(editorInfo, false);
            vwf vwfVar22 = wwf.a;
            if (r3b.d()) {
            }
            qnn qnnVar22 = new qnn(this.h, new h4b(this), this.i.c, this.e, this.f, this.g);
            this.j.add(new WeakReference(qnnVar22));
            return qnnVar22;
        }
        i = 6;
        editorInfo.imeOptions = i;
        bqgVar = ideVar.f;
        if (Intrinsics.d(bqgVar, bqg.c)) {
        }
        if (i5 != 1) {
        }
        i2 = 1;
        editorInfo.inputType = i2;
        if (!z) {
        }
        i3 = editorInfo.inputType;
        if ((i3 & 1) == 1) {
        }
        int i6222 = rds.c;
        editorInfo.initialSelStart = (int) (j >> 32);
        editorInfo.initialSelEnd = (int) (j & 4294967295L);
        l1b.l(editorInfo, str);
        editorInfo.imeOptions |= 33554432;
        if (qmr.a) {
        }
        l1b.m(editorInfo, false);
        vwf vwfVar222 = wwf.a;
        if (r3b.d()) {
        }
        qnn qnnVar222 = new qnn(this.h, new h4b(this), this.i.c, this.e, this.f, this.g);
        this.j.add(new WeakReference(qnnVar222));
        return qnnVar222;
    }
}
