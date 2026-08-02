package bo.app;

import com.braze.events.IEventSubscriber;

/* loaded from: classes3.dex */
public final /* synthetic */ class mg$$ExternalSyntheticLambda7 implements IEventSubscriber {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ mg$$ExternalSyntheticLambda7(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // com.braze.events.IEventSubscriber
    public final void trigger(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                mg.a((mg) obj2, (dg) obj);
                break;
            case 1:
                q5.a((q5) obj2, (o5) obj);
                break;
            case 2:
                qc.a((qc) obj2, (rc) obj);
                break;
            default:
                y1.a((y1) obj2, (xe) obj);
                break;
        }
    }
}
