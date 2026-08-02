package defpackage;

import android.content.ContentValues;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import com.google.android.gms.tasks.Task;
import java.nio.ByteBuffer;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class bs4 implements u6c, dup, dna, p7q, pcm, w2q, f72, lci, aqr, s3c, z2o, vue, q3c, xij {
    public static final bs4 b = new bs4(0);
    public static final bs4 c = new bs4(1);
    public static final bs4 d = new bs4(2);
    public static final bs4 e = new bs4(3);
    public static final bs4 f = new bs4(4);
    public static final bs4 g = new bs4(5);
    public static final e41 h = new e41();
    public static final bs4 i = new bs4(7);
    public static final tdp j = new tdp();
    public static final e7o k = new e7o(23);
    public static final e7o l = new e7o(24);
    public static final bs4 m = new bs4(10);
    public static final bs4 n = new bs4(11);
    public static final bs4 o = new bs4(12);
    public final /* synthetic */ int a;

    public /* synthetic */ bs4(int i2) {
        this.a = i2;
    }

    public static g94 r(String str) {
        if (str == null) {
            return null;
        }
        for (g94 g94Var : g94.values()) {
            if (g94Var.a.equals(str)) {
                return g94Var;
            }
        }
        return null;
    }

    public static final void s(qhb qhbVar, View view, View view2) {
        if (bp6.a.contains(bs4.class)) {
            return;
        }
        try {
            qhbVar.getClass();
            String str = qhbVar.a;
            gs4 gs4Var = gs4.f;
            Bundle C = mvn.C(qhbVar, view, view2);
            b.x(C);
            j3c.d().execute(new x8x(17, str, C));
        } catch (Throwable th) {
            bp6.a(bs4.class, th);
        }
    }

    @Override // defpackage.r2i
    public Object A(byte[] bArr) {
        if (bArr.length < 3) {
            throw new NumberFormatException("Malformed status code ".concat(new String(bArr, wue.a)));
        }
        return Integer.valueOf((bArr[2] - 48) + ((bArr[1] - 48) * 10) + ((bArr[0] - 48) * 100));
    }

    @Override // defpackage.dup
    public ocg I(long j2, xof xofVar, jx7 jx7Var) {
        xofVar.getClass();
        jx7Var.getClass();
        float d2 = nmq.d(j2);
        float b2 = nmq.b(j2);
        float n0 = jx7Var.n0(16);
        nh0 a = ph0.a();
        float f2 = b2 * 0.97436f;
        Path path = a.a;
        a.f(d2, f2);
        a.e(d2, 0.02564f * b2);
        float f3 = n0 * 2;
        float f4 = d2 - f3;
        if (a.b == null) {
            a.b = new RectF();
        }
        RectF rectF = a.b;
        rectF.getClass();
        rectF.set(f4, 0.0f, d2, f3);
        RectF rectF2 = a.b;
        rectF2.getClass();
        path.arcTo(rectF2, 0.0f, -90.0f, false);
        a.e(0.72199f * d2, 0.0f);
        float f5 = b2 * 0.00963f;
        a.c(0.70872f * d2, 0.0f, d2 * 0.69606f, b2 * 0.00379f, d2 * 0.68574f, f5);
        float f6 = 0.02554f * b2;
        float f7 = 0.04556f * b2;
        a.c(0.65762f * d2, f6, 0.59269f * d2, f7, 0.50305f * d2, f7);
        a.c(0.41189f * d2, f7, 0.34288f * d2, f6, 0.31384f * d2, f5);
        a.c(0.30384f * d2, 0.00344f * b2, 0.29173f * d2, 0.0f, d2 * 0.27911f, 0.0f);
        a.e(0.03659f * d2, 0.0f);
        if (a.b == null) {
            a.b = new RectF();
        }
        RectF rectF3 = a.b;
        rectF3.getClass();
        rectF3.set(0.0f, 0.0f, f3, f3);
        RectF rectF4 = a.b;
        rectF4.getClass();
        path.arcTo(rectF4, -90.0f, -90.0f, false);
        a.e(0.0f, 0.25821f * b2);
        float f8 = 0.0819f * d2;
        float f9 = 0.38642f * b2;
        float f10 = d2 * 0.12293f;
        a.c(0.0f, 0.32902f * b2, f8, f9, f10, f9);
        float f11 = 0.12901999f * d2;
        a.e(f11, f9);
        float f12 = 0.41206f * b2;
        a.e(f11, f12);
        a.e(f10, f12);
        a.c(f8, f12, 0.0f, 0.46946f * b2, 0.0f, 0.54026f * b2);
        a.e(0.0f, f2);
        float f13 = b2 - f3;
        if (a.b == null) {
            a.b = new RectF();
        }
        RectF rectF5 = a.b;
        rectF5.getClass();
        rectF5.set(0.0f, f13, f3, b2);
        RectF rectF6 = a.b;
        rectF6.getClass();
        path.arcTo(rectF6, 180.0f, -90.0f, false);
        a.e(0.96341f * d2, b2);
        if (a.b == null) {
            a.b = new RectF();
        }
        RectF rectF7 = a.b;
        rectF7.getClass();
        rectF7.set(f4, f13, d2, b2);
        RectF rectF8 = a.b;
        rectF8.getClass();
        path.arcTo(rectF8, 90.0f, -90.0f, false);
        a.b();
        return new zxj(a);
    }

    @Override // defpackage.u6c
    public void L(boolean z) {
        if (z) {
            teu teuVar = ds4.a;
            if (bp6.a.contains(ds4.class)) {
                return;
            }
            try {
                ds4.e.set(true);
                return;
            } catch (Throwable th) {
                bp6.a(ds4.class, th);
                return;
            }
        }
        teu teuVar2 = ds4.a;
        if (bp6.a.contains(ds4.class)) {
            return;
        }
        try {
            ds4.e.set(false);
        } catch (Throwable th2) {
            bp6.a(ds4.class, th2);
        }
    }

    @Override // defpackage.r2i
    public byte[] a(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.s3c
    public void b(Object obj) {
        ((List) obj).clear();
    }

    @Override // defpackage.w2q
    public Object c(foc focVar) {
        switch (this.a) {
            case 10:
                focVar.getClass();
                return qlv.b;
            default:
                focVar.getClass();
                return Boolean.FALSE;
        }
    }

    @Override // defpackage.xij
    public ajj call() {
        return new ejj(16);
    }

    @Override // defpackage.dna
    public Object e(pfm pfmVar, ak0 ak0Var, woa woaVar, woa woaVar2, Function2 function2, xoa xoaVar) {
        Object f2 = wna.f(pfmVar, ak0Var, woaVar, woaVar2, function2, xoaVar);
        return f2 == nm6.a ? f2 : Unit.a;
    }

    @Override // defpackage.q3c
    public Object f() {
        return new rqg();
    }

    @Override // defpackage.w2q
    public Object g(faq faqVar) {
        switch (this.a) {
            case 10:
                faqVar.getClass();
                if (faqVar instanceof daq) {
                    return qlv.c;
                }
                if (faqVar instanceof naq) {
                    return a4g.G(((naq) faqVar).e) ? qlv.d : qlv.a;
                }
                if (faqVar instanceof saq) {
                    return qlv.a;
                }
                if (faqVar instanceof qaq) {
                    return qlv.a;
                }
                b6e.s();
                return null;
            default:
                faqVar.getClass();
                return Boolean.FALSE;
        }
    }

    @Override // defpackage.w2q
    public Object h(jzs jzsVar) {
        switch (this.a) {
            case 10:
                jzsVar.getClass();
                return a4g.G(jzsVar.a) ? qlv.d : qlv.a;
            default:
                jzsVar.getClass();
                mqs mqsVar = jzsVar.a;
                return Boolean.valueOf(mqsVar.k == dg2.b && !mqsVar.L);
        }
    }

    @Override // defpackage.w2q
    public Object i(m1q m1qVar) {
        switch (this.a) {
            case 10:
                m1qVar.getClass();
                if (m1qVar instanceof c2q) {
                    return a4g.G(((c2q) m1qVar).f) ? qlv.d : qlv.a;
                }
                if (m1qVar instanceof j1q) {
                    return qlv.c;
                }
                if (m1qVar instanceof e2q) {
                    return qlv.a;
                }
                b6e.s();
                return null;
            default:
                m1qVar.getClass();
                return Boolean.FALSE;
        }
    }

    @Override // defpackage.w2q
    public Object j(i5u i5uVar) {
        switch (this.a) {
            case 10:
                i5uVar.getClass();
                return qlv.a;
            default:
                i5uVar.getClass();
                return Boolean.FALSE;
        }
    }

    @Override // defpackage.w2q
    public Object k(k4d k4dVar) {
        switch (this.a) {
            case 10:
                k4dVar.getClass();
                return qlv.c;
            default:
                k4dVar.getClass();
                return Boolean.FALSE;
        }
    }

    @Override // defpackage.aqr
    public Task l(Object obj) {
        return ywf.w(Boolean.TRUE);
    }

    @Override // defpackage.p7q
    public Object m(ioc iocVar) {
        iocVar.getClass();
        return Boolean.FALSE;
    }

    @Override // defpackage.p7q
    public Object n(szu szuVar) {
        szuVar.getClass();
        return Boolean.TRUE;
    }

    @Override // defpackage.f72
    public void o(rsr rsrVar) {
        rsrVar.getClass();
        rsrVar.execSQL("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
        rsrVar.update("WorkSpec", 3, contentValues, "last_enqueue_time = 0 AND interval_duration <> 0 ", new Object[0]);
    }

    public void p(q0d q0dVar, d1d d1dVar, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        q0dVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(71673695);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.h(q0dVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? oq5Var.f(d1dVar) : oq5Var.h(d1dVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            n7w.o(q0dVar, d1dVar, yciVar, oq5Var, i3 & 1022);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new wda(i2, 7, this, q0dVar, d1dVar, yciVar);
        }
    }

    @Override // defpackage.p7q
    public Object q(y4d y4dVar) {
        y4dVar.getClass();
        return Boolean.FALSE;
    }

    @Override // defpackage.p7q
    public Object q0(maq maqVar) {
        boolean z;
        maqVar.getClass();
        f5q k2 = maqVar.k();
        if (k2 instanceof bbq) {
            z = true;
        } else {
            if (!(k2 instanceof s9q) && !(k2 instanceof baq) && !(k2 instanceof oaq) && !(k2 instanceof taq)) {
                b6e.s();
                return null;
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.p7q
    public Object t(t1q t1qVar) {
        t1qVar.getClass();
        return Boolean.FALSE;
    }

    @Override // defpackage.p7q
    public Object u(u7u u7uVar) {
        u7uVar.getClass();
        return Boolean.FALSE;
    }

    public iaf v(KeyEvent keyEvent) {
        iaf iafVar;
        iaf iafVar2;
        iaf iafVar3 = null;
        if (keyEvent.isShiftPressed() && keyEvent.isAltPressed()) {
            long h2 = y2x.h(keyEvent.getKeyCode());
            if (faf.a(h2, pah.i)) {
                iafVar = iaf.SELECT_LINE_LEFT;
            } else if (faf.a(h2, pah.j)) {
                iafVar = iaf.SELECT_LINE_RIGHT;
            } else if (faf.a(h2, pah.k)) {
                iafVar = iaf.SELECT_HOME;
            } else {
                if (faf.a(h2, pah.l)) {
                    iafVar = iaf.SELECT_END;
                }
                iafVar = null;
            }
        } else {
            if (keyEvent.isAltPressed()) {
                long h3 = y2x.h(keyEvent.getKeyCode());
                if (faf.a(h3, pah.i)) {
                    iafVar = iaf.LINE_LEFT;
                } else if (faf.a(h3, pah.j)) {
                    iafVar = iaf.LINE_RIGHT;
                } else if (faf.a(h3, pah.k)) {
                    iafVar = iaf.HOME;
                } else if (faf.a(h3, pah.l)) {
                    iafVar = iaf.END;
                }
            }
            iafVar = null;
        }
        if (iafVar != null) {
            return iafVar;
        }
        h4b h4bVar = zaf.a;
        h4bVar.getClass();
        if (keyEvent.isShiftPressed() && keyEvent.isCtrlPressed()) {
            long h4 = y2x.h(keyEvent.getKeyCode());
            if (faf.a(h4, pah.i)) {
                iafVar2 = iaf.SELECT_LEFT_WORD;
            } else if (faf.a(h4, pah.j)) {
                iafVar2 = iaf.SELECT_RIGHT_WORD;
            } else if (faf.a(h4, pah.k)) {
                iafVar2 = iaf.SELECT_PREV_PARAGRAPH;
            } else {
                if (faf.a(h4, pah.l)) {
                    iafVar2 = iaf.SELECT_NEXT_PARAGRAPH;
                }
                iafVar2 = null;
            }
        } else if (keyEvent.isCtrlPressed()) {
            long h5 = y2x.h(keyEvent.getKeyCode());
            if (faf.a(h5, pah.i)) {
                iafVar2 = iaf.LEFT_WORD;
            } else if (faf.a(h5, pah.j)) {
                iafVar2 = iaf.RIGHT_WORD;
            } else if (faf.a(h5, pah.k)) {
                iafVar2 = iaf.PREV_PARAGRAPH;
            } else if (faf.a(h5, pah.l)) {
                iafVar2 = iaf.NEXT_PARAGRAPH;
            } else if (faf.a(h5, pah.c)) {
                iafVar2 = iaf.DELETE_PREV_CHAR;
            } else if (faf.a(h5, pah.u)) {
                iafVar2 = iaf.DELETE_NEXT_WORD;
            } else if (faf.a(h5, pah.t)) {
                iafVar2 = iaf.DELETE_PREV_WORD;
            } else {
                if (faf.a(h5, pah.h)) {
                    iafVar2 = iaf.DESELECT;
                }
                iafVar2 = null;
            }
        } else if (keyEvent.isShiftPressed()) {
            long h6 = y2x.h(keyEvent.getKeyCode());
            if (faf.a(h6, pah.o)) {
                iafVar2 = iaf.SELECT_LINE_START;
            } else {
                if (faf.a(h6, pah.p)) {
                    iafVar2 = iaf.SELECT_LINE_END;
                }
                iafVar2 = null;
            }
        } else {
            if (keyEvent.isAltPressed()) {
                long h7 = y2x.h(keyEvent.getKeyCode());
                if (faf.a(h7, pah.t)) {
                    iafVar2 = iaf.DELETE_FROM_LINE_START;
                } else if (faf.a(h7, pah.u)) {
                    iafVar2 = iaf.DELETE_TO_LINE_END;
                }
            }
            iafVar2 = null;
        }
        if (iafVar2 != null) {
            return iafVar2;
        }
        ((klx) h4bVar.a).getClass();
        int i2 = yaf.b;
        if (!keyEvent.isCtrlPressed() || !keyEvent.isShiftPressed()) {
            if (keyEvent.isCtrlPressed()) {
                long R = saf.R(keyEvent);
                if (faf.a(R, pah.b) ? true : faf.a(R, pah.q)) {
                    iafVar3 = iaf.COPY;
                } else if (faf.a(R, pah.d)) {
                    iafVar3 = iaf.PASTE;
                } else if (faf.a(R, pah.f)) {
                    iafVar3 = iaf.CUT;
                } else if (faf.a(R, pah.a)) {
                    iafVar3 = iaf.SELECT_ALL;
                } else if (faf.a(R, pah.e)) {
                    iafVar3 = iaf.REDO;
                } else if (faf.a(R, pah.g)) {
                    iafVar3 = iaf.UNDO;
                }
            } else if (!keyEvent.isCtrlPressed()) {
                if (keyEvent.isShiftPressed()) {
                    long h8 = y2x.h(keyEvent.getKeyCode());
                    if (faf.a(h8, pah.i)) {
                        iafVar3 = iaf.SELECT_LEFT_CHAR;
                    } else if (faf.a(h8, pah.j)) {
                        iafVar3 = iaf.SELECT_RIGHT_CHAR;
                    } else if (faf.a(h8, pah.k)) {
                        iafVar3 = iaf.SELECT_UP;
                    } else if (faf.a(h8, pah.l)) {
                        iafVar3 = iaf.SELECT_DOWN;
                    } else if (faf.a(h8, pah.m)) {
                        iafVar3 = iaf.SELECT_PAGE_UP;
                    } else if (faf.a(h8, pah.n)) {
                        iafVar3 = iaf.SELECT_PAGE_DOWN;
                    } else if (faf.a(h8, pah.o)) {
                        iafVar3 = iaf.SELECT_LINE_START;
                    } else if (faf.a(h8, pah.p)) {
                        iafVar3 = iaf.SELECT_LINE_END;
                    } else if (faf.a(h8, pah.q)) {
                        iafVar3 = iaf.PASTE;
                    }
                } else {
                    long h9 = y2x.h(keyEvent.getKeyCode());
                    if (faf.a(h9, pah.i)) {
                        iafVar3 = iaf.LEFT_CHAR;
                    } else if (faf.a(h9, pah.j)) {
                        iafVar3 = iaf.RIGHT_CHAR;
                    } else if (faf.a(h9, pah.k)) {
                        iafVar3 = iaf.UP;
                    } else if (faf.a(h9, pah.l)) {
                        iafVar3 = iaf.DOWN;
                    } else if (faf.a(h9, pah.m)) {
                        iafVar3 = iaf.PAGE_UP;
                    } else if (faf.a(h9, pah.n)) {
                        iafVar3 = iaf.PAGE_DOWN;
                    } else if (faf.a(h9, pah.o)) {
                        iafVar3 = iaf.LINE_START;
                    } else if (faf.a(h9, pah.p)) {
                        iafVar3 = iaf.LINE_END;
                    } else {
                        if (faf.a(h9, pah.r) ? true : faf.a(h9, pah.s)) {
                            iafVar3 = iaf.NEW_LINE;
                        } else if (faf.a(h9, pah.t)) {
                            iafVar3 = iaf.DELETE_PREV_CHAR;
                        } else if (faf.a(h9, pah.u)) {
                            iafVar3 = iaf.DELETE_NEXT_CHAR;
                        } else if (faf.a(h9, pah.v)) {
                            iafVar3 = iaf.PASTE;
                        } else if (faf.a(h9, pah.w)) {
                            iafVar3 = iaf.CUT;
                        } else if (faf.a(h9, pah.x)) {
                            iafVar3 = iaf.COPY;
                        } else if (faf.a(h9, pah.y)) {
                            iafVar3 = iaf.TAB;
                        }
                    }
                }
            }
        } else if (faf.a(y2x.h(keyEvent.getKeyCode()), pah.g)) {
            iafVar3 = iaf.REDO;
        }
        return iafVar3;
    }

    @Override // defpackage.z2o
    public k2o w(k2o k2oVar, pwj pwjVar) {
        byte[] bArr;
        ByteBuffer asReadOnlyBuffer = ((vcd) ((pcd) k2oVar.get()).a.b).a.d.asReadOnlyBuffer();
        AtomicReference atomicReference = tm3.a;
        byt bytVar = (asReadOnlyBuffer.isReadOnly() || !asReadOnlyBuffer.hasArray()) ? null : new byt(asReadOnlyBuffer.array(), asReadOnlyBuffer.arrayOffset(), asReadOnlyBuffer.limit());
        if (bytVar != null && bytVar.a == 0 && bytVar.b == bytVar.c.length) {
            bArr = asReadOnlyBuffer.array();
        } else {
            ByteBuffer asReadOnlyBuffer2 = asReadOnlyBuffer.asReadOnlyBuffer();
            byte[] bArr2 = new byte[asReadOnlyBuffer2.limit()];
            asReadOnlyBuffer2.get(bArr2);
            bArr = bArr2;
        }
        return new sn3(bArr);
    }

    public void x(Bundle bundle) {
        Locale locale;
        if (bp6.a.contains(this)) {
            return;
        }
        try {
            String string = bundle.getString("_valueToSum");
            if (string != null) {
                double d2 = 0.0d;
                try {
                    Matcher matcher = Pattern.compile("[-+]*\\d+([.,]\\d+)*([.,]\\d+)?", 8).matcher(string);
                    if (matcher.find()) {
                        String group = matcher.group(0);
                        try {
                            Resources resources = j3c.b().getResources();
                            resources.getClass();
                            locale = resources.getConfiguration().locale;
                        } catch (Exception unused) {
                            locale = null;
                        }
                        if (locale == null) {
                            locale = Locale.getDefault();
                            locale.getClass();
                        }
                        d2 = NumberFormat.getNumberInstance(locale).parse(group).doubleValue();
                    }
                } catch (ParseException unused2) {
                }
                bundle.putDouble("_valueToSum", d2);
            }
            bundle.putString("_is_fb_codeless", "1");
        } catch (Throwable th) {
            bp6.a(this, th);
        }
    }

    @Override // defpackage.lci
    public kci y(kkp kkpVar) {
        return new dm3(0, new klx(15));
    }
}
