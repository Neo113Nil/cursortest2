package defpackage;

import androidx.fragment.app.a;
import androidx.fragment.app.o;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import java.util.List;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class ddl implements xjn, r2i, pun {
    @Override // defpackage.r2i
    public Object A(byte[] bArr) {
        int i;
        byte b;
        char c = 0;
        if (bArr.length == 1 && bArr[0] == 48) {
            return sgr.e;
        }
        int length = bArr.length;
        if (length != 1) {
            if (length == 2 && (b = bArr[0]) >= 48 && b <= 57) {
                i = (b - 48) * 10;
                c = 1;
            }
            return sgr.g.i("Unknown code ".concat(new String(bArr, pe4.a)));
        }
        i = 0;
        byte b2 = bArr[c];
        if (b2 >= 48 && b2 <= 57) {
            int i2 = (b2 - 48) + i;
            List list = sgr.d;
            if (i2 < list.size()) {
                return (sgr) list.get(i2);
            }
        }
        return sgr.g.i("Unknown code ".concat(new String(bArr, pe4.a)));
    }

    @Override // defpackage.r2i
    public byte[] a(Object obj) {
        return ((sgr) obj).a.b;
    }

    @Override // defpackage.pun
    public void accept(Object obj, Object obj2) {
        msg msgVar = h4x.G;
        ((y0x) ((jox) obj).s()).S0();
        ((i8s) obj2).b(null);
    }

    @Override // defpackage.sjn
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public o getValue(t tVar, s9f s9fVar) {
        tVar.getClass();
        s9fVar.getClass();
        o C = tVar.getSupportFragmentManager().C(R.id.fragment_container_view);
        if (C == null) {
            return null;
        }
        return C;
    }

    @Override // defpackage.xjn
    public void setValue(Object obj, s9f s9fVar, Object obj2) {
        t tVar = (t) obj;
        o oVar = (o) obj2;
        tVar.getClass();
        s9fVar.getClass();
        y supportFragmentManager = tVar.getSupportFragmentManager();
        supportFragmentManager.getClass();
        a aVar = new a(supportFragmentManager);
        if (oVar != null) {
            aVar.e(R.id.fragment_container_view, oVar, null);
        } else {
            o value = getValue(tVar, s9fVar);
            if (value == null) {
                return;
            } else {
                aVar.m(value);
            }
        }
        aVar.j();
    }
}
