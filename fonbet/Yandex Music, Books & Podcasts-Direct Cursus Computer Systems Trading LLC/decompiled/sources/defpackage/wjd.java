package defpackage;

import kotlin.Unit;

/* loaded from: classes5.dex */
public final /* synthetic */ class wjd extends ezc implements ryc {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wjd(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    @Override // defpackage.ryc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                a8i a8iVar = (a8i) obj;
                spd spdVar = (spd) obj2;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                String str = (String) obj4;
                a8iVar.getClass();
                spdVar.getClass();
                str.getClass();
                ((l8i) this.receiver).d(a8iVar, spdVar, booleanValue, str);
                break;
            default:
                a8i a8iVar2 = (a8i) obj;
                spd spdVar2 = (spd) obj2;
                boolean booleanValue2 = ((Boolean) obj3).booleanValue();
                String str2 = (String) obj4;
                a8iVar2.getClass();
                spdVar2.getClass();
                str2.getClass();
                ((l8i) this.receiver).d(a8iVar2, spdVar2, booleanValue2, str2);
                break;
        }
        return Unit.a;
    }
}
