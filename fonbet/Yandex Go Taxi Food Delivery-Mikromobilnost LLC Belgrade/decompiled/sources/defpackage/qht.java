package defpackage;

import com.bumptech.glide.RequestManager;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes2.dex */
public final /* synthetic */ class qht implements hxy {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qht(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.hxy
    public final void cancel() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((RequestManager) obj2).clear((rht) obj);
                break;
            case 1:
                ((RequestManager) obj2).clear((rht) obj);
                break;
            default:
                ((qm71) ((ntk) obj2).b).a(new qkh(2, (Ref$ObjectRef) obj));
                break;
        }
    }
}
