package defpackage;

import com.google.android.gms.internal.measurement.e;
import com.google.android.gms.internal.measurement.zzco;
import com.google.android.gms.internal.measurement.zzcr;

/* loaded from: classes11.dex */
public final class vk91 extends gp91 {
    public final /* synthetic */ int x;
    public final /* synthetic */ zzco y;
    public final /* synthetic */ e z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vk91(e eVar, zzco zzcoVar, int i) {
        super(eVar, true);
        this.x = i;
        this.y = zzcoVar;
        this.z = eVar;
    }

    @Override // defpackage.gp91
    public final void a() {
        switch (this.x) {
            case 0:
                zzcr zzcrVar = this.z.f;
                cvw.l(zzcrVar);
                zzcrVar.getGmpAppId(this.y);
                break;
            case 1:
                zzcr zzcrVar2 = this.z.f;
                cvw.l(zzcrVar2);
                zzcrVar2.getCachedAppInstanceId(this.y);
                break;
            case 2:
                zzcr zzcrVar3 = this.z.f;
                cvw.l(zzcrVar3);
                zzcrVar3.generateEventId(this.y);
                break;
            case 3:
                zzcr zzcrVar4 = this.z.f;
                cvw.l(zzcrVar4);
                zzcrVar4.getCurrentScreenName(this.y);
                break;
            default:
                zzcr zzcrVar5 = this.z.f;
                cvw.l(zzcrVar5);
                zzcrVar5.getCurrentScreenClass(this.y);
                break;
        }
    }

    @Override // defpackage.gp91
    public final void b() {
        int i = this.x;
        zzco zzcoVar = this.y;
        switch (i) {
            case 0:
                zzcoVar.zzb(null);
                break;
            case 1:
                zzcoVar.zzb(null);
                break;
            case 2:
                zzcoVar.zzb(null);
                break;
            case 3:
                zzcoVar.zzb(null);
                break;
            default:
                zzcoVar.zzb(null);
                break;
        }
    }
}
