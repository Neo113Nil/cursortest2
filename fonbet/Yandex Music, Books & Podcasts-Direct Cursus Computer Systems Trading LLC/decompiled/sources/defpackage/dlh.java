package defpackage;

import android.media.MediaRoute2Info;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import androidx.media3.session.i;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class dlh implements ycg, fmh, myc, kth, fvh, ua6, evh {
    public final /* synthetic */ int a;

    public /* synthetic */ dlh(int i) {
        this.a = i;
    }

    public static /* bridge */ /* synthetic */ MediaRoute2Info c(Object obj) {
        return (MediaRoute2Info) obj;
    }

    public static /* synthetic */ void d(int i, String str) {
        throw new IllegalStateException(str + i);
    }

    @Override // defpackage.kth
    public void a(vrh vrhVar, int i) {
        switch (this.a) {
            case 10:
                vrhVar.getClass();
                break;
            case 11:
                vrhVar.getClass();
                break;
            default:
                vrhVar.a(i);
                break;
        }
    }

    @Override // defpackage.ua6
    public void accept(Object obj) {
        lrl lrlVar = (lrl) obj;
        switch (this.a) {
            case 16:
                lrlVar.b();
                break;
            case 17:
                lrlVar.M();
                break;
            case 18:
                lrlVar.Y();
                break;
            case 19:
                lrlVar.G0();
                break;
            case 20:
                lrlVar.K();
                break;
            case 21:
                lrlVar.B();
                break;
            case 22:
            case 25:
            default:
                lrlVar.stop();
                break;
            case 23:
                lrlVar.F0();
                break;
            case 24:
                lrlVar.b0();
                break;
            case 26:
                lrlVar.E();
                break;
        }
    }

    @Override // defpackage.myc
    public Object apply(Object obj) {
        switch (this.a) {
            case 5:
                kjr kjrVar = (kjr) obj;
                kjrVar.getClass();
                Bundle bundle = new Bundle();
                int i = kjrVar.a;
                if (i != 0) {
                    bundle.putInt(kjr.d, i);
                }
                int i2 = kjrVar.b;
                if (i2 != 0) {
                    bundle.putInt(kjr.e, i2);
                }
                int i3 = kjrVar.c;
                if (i3 != 0) {
                    bundle.putInt(kjr.f, i3);
                }
                return bundle;
            case 6:
                mnh mnhVar = (mnh) obj;
                mnhVar.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable(mnh.h, mnhVar.a);
                String str = mnhVar.b;
                if (str != null) {
                    bundle2.putString(mnh.i, str);
                }
                String str2 = mnhVar.c;
                if (str2 != null) {
                    bundle2.putString(mnh.j, str2);
                }
                int i4 = mnhVar.d;
                if (i4 != 0) {
                    bundle2.putInt(mnh.k, i4);
                }
                int i5 = mnhVar.e;
                if (i5 != 0) {
                    bundle2.putInt(mnh.l, i5);
                }
                String str3 = mnhVar.f;
                if (str3 != null) {
                    bundle2.putString(mnh.m, str3);
                }
                String str4 = mnhVar.g;
                if (str4 != null) {
                    bundle2.putString(mnh.n, str4);
                }
                return bundle2;
            default:
                Bundle bundle3 = (Bundle) obj;
                Uri uri = (Uri) bundle3.getParcelable(mnh.h);
                uri.getClass();
                String string = bundle3.getString(mnh.i);
                String string2 = bundle3.getString(mnh.j);
                int i6 = bundle3.getInt(mnh.k, 0);
                int i7 = bundle3.getInt(mnh.l, 0);
                String string3 = bundle3.getString(mnh.m);
                String string4 = bundle3.getString(mnh.n);
                eg0 eg0Var = new eg0();
                eg0Var.c = uri;
                eg0Var.d = l5i.p(string);
                eg0Var.e = string2;
                eg0Var.a = i6;
                eg0Var.b = i7;
                eg0Var.f = string3;
                eg0Var.g = string4;
                return new mnh(eg0Var);
        }
    }

    @Override // defpackage.evh
    public void b(lrl lrlVar, wrh wrhVar, List list) {
        switch (this.a) {
            case 25:
                lrlVar.A0(list);
                break;
            default:
                lrlVar.A0(list);
                break;
        }
    }

    @Override // defpackage.fmh
    public void f(ulh ulhVar) {
        switch (this.a) {
            case 1:
                if (ulhVar.isConnected()) {
                    kkh kkhVar = ulhVar.a;
                    kkhVar.getClass();
                    vq1.A(Looper.myLooper() == kkhVar.e.getLooper());
                    kkhVar.d.getClass();
                    return;
                }
                return;
            case 2:
                ulhVar.i.f(26, new xla(26));
                return;
            case 3:
                kkh kkhVar2 = ulhVar.a;
                Objects.requireNonNull(kkhVar2);
                kkhVar2.j1(new dyg(5, kkhVar2));
                return;
            default:
                throw new ClassCastException();
        }
    }

    @Override // defpackage.fvh
    public Object h(i iVar, wrh wrhVar, int i) {
        switch (this.a) {
            case 14:
                iVar.getClass();
                throw new ClassCastException();
            case 15:
                iVar.getClass();
                throw new ClassCastException();
            case 22:
                iVar.getClass();
                throw new ClassCastException();
            default:
                iVar.getClass();
                throw new ClassCastException();
        }
    }

    @Override // defpackage.ycg
    public void invoke(Object obj) {
        ((f8l) obj).p(1);
    }
}
