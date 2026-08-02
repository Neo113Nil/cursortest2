package defpackage;

import androidx.media3.session.i;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public final /* synthetic */ class tuh implements fvh, ua6, myc, m7t, zqr, nae {
    public final /* synthetic */ int a;

    public /* synthetic */ tuh(int i) {
        this.a = i;
    }

    public static /* synthetic */ void b(int i, Object obj) {
        throw new IllegalStateException("Source subfield " + i + ((Object) " is present but null: ") + obj);
    }

    public static /* synthetic */ void c(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalStateException((str + obj + obj2 + obj3 + obj4).toString());
    }

    @Override // defpackage.nae
    public boolean a(int i, int i2, int i3, int i4, int i5) {
        if (i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) {
            return true;
        }
        if (i2 == 77 && i3 == 76 && i4 == 76) {
            return i5 == 84 || i == 2;
        }
        return false;
    }

    @Override // defpackage.ua6
    public void accept(Object obj) {
        lrl lrlVar = (lrl) obj;
        switch (this.a) {
            case 1:
                lrlVar.q();
                break;
            case 2:
                lrlVar.C();
                break;
            default:
                lrlVar.y();
                break;
        }
    }

    @Override // defpackage.myc
    public Object apply(Object obj) {
        switch (this.a) {
            case 8:
                return Long.valueOf(((uv6) obj).b);
            case 9:
                return Long.valueOf(((uv6) obj).c);
            case 10:
                return yde.v(ldg.O(new wvs(1), ((woh) obj).m().b));
            case 11:
            default:
                return (oqs) obj;
            case 12:
                g0i g0iVar = (g0i) obj;
                sfm sfmVar = oym.a;
                sfmVar.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    sfmVar.q(g0iVar, byteArrayOutputStream);
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
        }
    }

    @Override // defpackage.zqr
    public Object get() {
        switch (this.a) {
            case 13:
                ArrayList arrayList = new ArrayList(7);
                arrayList.add(new luo(0L, 100.0d));
                arrayList.add(new luo(333L, 95.0d));
                arrayList.add(new luo(900L, 85.0d));
                arrayList.add(new luo(2000L, 70.0d));
                arrayList.add(new luo(4800L, 50.0d));
                arrayList.add(new luo(14000L, 25.0d));
                arrayList.add(new luo(28000L, 0.0d));
                return arrayList;
            case 14:
                ArrayList arrayList2 = new ArrayList(7);
                arrayList2.add(new luo(0L, 100.0d));
                arrayList2.add(new luo(150L, 95.0d));
                arrayList2.add(new luo(300L, 85.0d));
                arrayList2.add(new luo(400L, 70.0d));
                arrayList2.add(new luo(800L, 50.0d));
                arrayList2.add(new luo(4500L, 25.0d));
                arrayList2.add(new luo(9000L, 0.0d));
                return arrayList2;
            case 15:
                ArrayList arrayList3 = new ArrayList(7);
                arrayList3.add(new luo(0L, 100.0d));
                arrayList3.add(new luo(500L, 95.0d));
                arrayList3.add(new luo(1000L, 85.0d));
                arrayList3.add(new luo(2000L, 70.0d));
                arrayList3.add(new luo(3500L, 50.0d));
                arrayList3.add(new luo(5000L, 25.0d));
                arrayList3.add(new luo(10000L, 0.0d));
                return arrayList3;
            case 16:
                ArrayList arrayList4 = new ArrayList(7);
                arrayList4.add(new luo(0L, 100.0d));
                arrayList4.add(new luo(50L, 95.0d));
                arrayList4.add(new luo(100L, 85.0d));
                arrayList4.add(new luo(150L, 70.0d));
                arrayList4.add(new luo(300L, 50.0d));
                arrayList4.add(new luo(500L, 25.0d));
                arrayList4.add(new luo(750L, 0.0d));
                return arrayList4;
            case 17:
                ArrayList arrayList5 = new ArrayList(7);
                arrayList5.add(new luo(0L, 100.0d));
                arrayList5.add(new luo(50L, 95.0d));
                arrayList5.add(new luo(125L, 85.0d));
                arrayList5.add(new luo(200L, 70.0d));
                arrayList5.add(new luo(500L, 50.0d));
                arrayList5.add(new luo(1000L, 25.0d));
                arrayList5.add(new luo(2000L, 0.0d));
                return arrayList5;
            case 18:
                HashMap hashMap = new HashMap(4);
                Double valueOf = Double.valueOf(0.2d);
                hashMap.put("FirstFrameDrawn", valueOf);
                Double valueOf2 = Double.valueOf(0.3d);
                hashMap.put("FirstContentShown", valueOf2);
                hashMap.put("FirstInputDelay", valueOf);
                hashMap.put("TimeToInteractive", valueOf2);
                return hashMap;
            case 19:
                HashMap hashMap2 = new HashMap(4);
                Double valueOf3 = Double.valueOf(0.2d);
                hashMap2.put("FirstFrameDrawn", valueOf3);
                Double valueOf4 = Double.valueOf(0.3d);
                hashMap2.put("FirstContentShown", valueOf4);
                hashMap2.put("InteractionToNextPaint", valueOf3);
                hashMap2.put("TimeToInteractive", valueOf4);
                return hashMap2;
            default:
                HashSet hashSet = new HashSet(1);
                hashSet.add("FirstInputDelay");
                hashSet.add("InteractionToNextPaint");
                return hashSet;
        }
    }

    @Override // defpackage.fvh
    public Object h(i iVar, wrh wrhVar, int i) {
        switch (this.a) {
            case 0:
                iVar.getClass();
                throw new ClassCastException();
            case 3:
                iVar.getClass();
                throw new ClassCastException();
            default:
                iVar.getClass();
                throw new ClassCastException();
        }
    }

    public /* synthetic */ tuh(int i, Object obj) {
        this.a = i;
    }
}
