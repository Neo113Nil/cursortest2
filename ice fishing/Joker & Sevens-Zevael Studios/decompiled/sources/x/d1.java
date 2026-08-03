package x;

import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d1 extends hc.j implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7764g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h0 f7765h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d1(h0 h0Var, fc.d dVar, int i10) {
        super(2, dVar);
        this.f7764g = i10;
        this.f7765h = h0Var;
    }

    @Override // hc.a
    public final fc.d create(Object obj, fc.d dVar) {
        switch (this.f7764g) {
            case 0:
                return new d1(this.f7765h, dVar, 0);
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return new d1(this.f7765h, dVar, 1);
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                return new d1(this.f7765h, dVar, 2);
            case 3:
                return new d1(this.f7765h, dVar, 3);
            case 4:
                return new d1(this.f7765h, dVar, 4);
            case 5:
                return new d1(this.f7765h, dVar, 5);
            case 6:
                return new d1(this.f7765h, dVar, 6);
            default:
                return new d1(this.f7765h, dVar, 7);
        }
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        yc.y yVar = (yc.y) obj;
        fc.d dVar = (fc.d) obj2;
        switch (this.f7764g) {
            case 0:
                d1 d1Var = (d1) create(yVar, dVar);
                ac.o oVar = ac.o.f277a;
                d1Var.invokeSuspend(oVar);
                return oVar;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                d1 d1Var2 = (d1) create(yVar, dVar);
                ac.o oVar2 = ac.o.f277a;
                d1Var2.invokeSuspend(oVar2);
                return oVar2;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                d1 d1Var3 = (d1) create(yVar, dVar);
                ac.o oVar3 = ac.o.f277a;
                d1Var3.invokeSuspend(oVar3);
                return oVar3;
            case 3:
                d1 d1Var4 = (d1) create(yVar, dVar);
                ac.o oVar4 = ac.o.f277a;
                d1Var4.invokeSuspend(oVar4);
                return oVar4;
            case 4:
                d1 d1Var5 = (d1) create(yVar, dVar);
                ac.o oVar5 = ac.o.f277a;
                d1Var5.invokeSuspend(oVar5);
                return oVar5;
            case 5:
                d1 d1Var6 = (d1) create(yVar, dVar);
                ac.o oVar6 = ac.o.f277a;
                d1Var6.invokeSuspend(oVar6);
                return oVar6;
            case 6:
                d1 d1Var7 = (d1) create(yVar, dVar);
                ac.o oVar7 = ac.o.f277a;
                d1Var7.invokeSuspend(oVar7);
                return oVar7;
            default:
                d1 d1Var8 = (d1) create(yVar, dVar);
                ac.o oVar8 = ac.o.f277a;
                d1Var8.invokeSuspend(oVar8);
                return oVar8;
        }
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f7764g) {
            case 0:
                v6.a.W(obj);
                h0 h0Var = this.f7765h;
                h0Var.f7800i = true;
                h0Var.f7801j.d(null);
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                v6.a.W(obj);
                h0 h0Var2 = this.f7765h;
                h0Var2.f7799h = true;
                h0Var2.f7801j.d(null);
                break;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                v6.a.W(obj);
                h0 h0Var3 = this.f7765h;
                h0Var3.f7799h = true;
                h0Var3.f7801j.d(null);
                break;
            case 3:
                v6.a.W(obj);
                h0 h0Var4 = this.f7765h;
                h0Var4.f7800i = true;
                h0Var4.f7801j.d(null);
                break;
            case 4:
                v6.a.W(obj);
                h0 h0Var5 = this.f7765h;
                h0Var5.f7799h = true;
                h0Var5.f7801j.d(null);
                break;
            case 5:
                v6.a.W(obj);
                h0 h0Var6 = this.f7765h;
                h0Var6.f7799h = true;
                h0Var6.f7801j.d(null);
                break;
            case 6:
                v6.a.W(obj);
                h0 h0Var7 = this.f7765h;
                h0Var7.f7799h = true;
                h0Var7.f7801j.d(null);
                break;
            default:
                v6.a.W(obj);
                h0 h0Var8 = this.f7765h;
                h0Var8.f7800i = true;
                h0Var8.f7801j.d(null);
                break;
        }
        return ac.o.f277a;
    }
}
