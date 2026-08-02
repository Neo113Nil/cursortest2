package defpackage;

import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.e;
import com.google.android.gms.internal.measurement.zzco;
import com.google.android.gms.internal.measurement.zzcr;

/* loaded from: classes11.dex */
public final class vm91 extends gp91 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int x = 1;
    public final /* synthetic */ String y;
    public final /* synthetic */ e z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vm91(e eVar, String str, zzco zzcoVar) {
        super(eVar, true);
        this.y = str;
        this.A = zzcoVar;
        this.z = eVar;
    }

    @Override // defpackage.gp91
    public final void a() {
        switch (this.x) {
            case 0:
                zzcr zzcrVar = this.z.f;
                cvw.l(zzcrVar);
                zzcrVar.logHealthData(5, this.y, ObjectWrapper.wrap(this.A), ObjectWrapper.wrap(null), ObjectWrapper.wrap(null));
                break;
            default:
                zzcr zzcrVar2 = this.z.f;
                cvw.l(zzcrVar2);
                zzcrVar2.getMaxUserProperties(this.y, (zzco) this.A);
                break;
        }
    }

    @Override // defpackage.gp91
    public void b() {
        switch (this.x) {
            case 1:
                ((zzco) this.A).zzb(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vm91(e eVar, String str, Object obj) {
        super(eVar, false);
        this.y = str;
        this.A = obj;
        this.z = eVar;
    }
}
