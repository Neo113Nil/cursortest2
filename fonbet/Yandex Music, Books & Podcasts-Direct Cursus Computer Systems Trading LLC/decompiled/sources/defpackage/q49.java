package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class q49 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ l49 s;
    public final /* synthetic */ xzb t;
    public final /* synthetic */ j79 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q49(l49 l49Var, xzb xzbVar, j79 j79Var, rt8 rt8Var) {
        super(1);
        this.r = 1;
        this.s = l49Var;
        this.t = xzbVar;
        this.u = j79Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i;
        switch (this.r) {
            case 0:
                this.u.setHintTextColor(((Number) this.s.y.a(this.t)).intValue());
                break;
            case 1:
                l49 l49Var = this.s;
                szb szbVar = l49Var.C;
                xzb xzbVar = this.t;
                j49 j49Var = (j49) szbVar.a(xzbVar);
                switch (j49Var) {
                    case SINGLE_LINE_TEXT:
                        i = 1;
                        break;
                    case MULTI_LINE_TEXT:
                        i = 131073;
                        break;
                    case PHONE:
                        i = 3;
                        break;
                    case NUMBER:
                        i = 12290;
                        break;
                    case EMAIL:
                        i = 33;
                        break;
                    case URI:
                        i = 17;
                        break;
                    case PASSWORD:
                        i = 129;
                        break;
                    default:
                        b6e.s();
                        break;
                }
                int ordinal = ((g49) l49Var.f.a(xzbVar)).ordinal();
                int i2 = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? 0 : 4096 : 16384 : RemoteCameraConfig.Notification.ID;
                j79 j79Var = this.u;
                j79Var.setInputType(i2 | i);
                j79Var.setHorizontallyScrolling(j49Var != j49.MULTI_LINE_TEXT);
                break;
            default:
                this.u.setSelectAllOnFocus(((Boolean) this.s.O.a(this.t)).booleanValue());
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q49(j79 j79Var, l49 l49Var, xzb xzbVar, int i) {
        super(1);
        this.r = i;
        this.u = j79Var;
        this.s = l49Var;
        this.t = xzbVar;
    }
}
