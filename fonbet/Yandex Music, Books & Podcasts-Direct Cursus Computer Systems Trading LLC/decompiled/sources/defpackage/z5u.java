package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class z5u extends aur implements Function2 {
    public final /* synthetic */ int j;
    public final /* synthetic */ a6u k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z5u(a6u a6uVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.k = a6uVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new z5u(this.k, continuation, 0);
            case 1:
                return new z5u(this.k, continuation, 1);
            case 2:
                return new z5u(this.k, continuation, 2);
            case 3:
                return new z5u(this.k, continuation, 3);
            case 4:
                return new z5u(this.k, continuation, 4);
            case 5:
                return new z5u(this.k, continuation, 5);
            case 6:
                return new z5u(this.k, continuation, 6);
            case 7:
                return new z5u(this.k, continuation, 7);
            default:
                return new z5u(this.k, continuation, 8);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((z5u) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        gbw gbwVar;
        gbw gbwVar2;
        gbw gbwVar3;
        int i = this.j;
        long j = 0;
        a6u a6uVar = this.k;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                int ordinal = a6uVar.h.ordinal();
                if ((ordinal == 3 || ordinal == 4) && (gbwVar = a6uVar.d) != null) {
                    j = gbwVar.a.o();
                }
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                gbw gbwVar4 = a6uVar.d;
                break;
            case 2:
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                gbw gbwVar5 = a6uVar.d;
                if (gbwVar5 == null) {
                    break;
                } else {
                    break;
                }
            case 3:
                nm6 nm6Var4 = nm6.a;
                qgg.h0(obj);
                ssg.a(3, "VideoClipPlayer", "mute", null);
                gbw gbwVar6 = a6uVar.d;
                a6uVar.e.b(gbwVar6 != null ? gbwVar6.a.getVolume() : 1.0f);
                gbw gbwVar7 = a6uVar.d;
                if (gbwVar7 != null) {
                    gbwVar7.t(0.0f);
                }
                a6u.y(a6uVar, a6uVar.h);
                break;
            case 4:
                nm6 nm6Var5 = nm6.a;
                qgg.h0(obj);
                ssg.a(3, "VideoClipPlayer", "pause", null);
                a6uVar.g = false;
                gbw gbwVar8 = a6uVar.d;
                if (gbwVar8 != null) {
                    gbwVar8.b();
                }
                a6u.y(a6uVar, a6uVar.h);
                break;
            case 5:
                nm6 nm6Var6 = nm6.a;
                qgg.h0(obj);
                ssg.a(3, "VideoClipPlayer", "play", null);
                a6uVar.g = true;
                if (a6uVar.h == tnl.d && (gbwVar2 = a6uVar.d) != null) {
                    gbwVar2.d();
                }
                a6u.y(a6uVar, a6uVar.h);
                break;
            case 6:
                nm6 nm6Var7 = nm6.a;
                qgg.h0(obj);
                int ordinal2 = a6uVar.h.ordinal();
                if ((ordinal2 == 3 || ordinal2 == 4) && (gbwVar3 = a6uVar.d) != null) {
                    j = gbwVar3.a.getPosition();
                }
                break;
            case 7:
                nm6 nm6Var8 = nm6.a;
                qgg.h0(obj);
                ssg.a(3, "VideoClipPlayer", "stop", null);
                a6uVar.g = false;
                gbw gbwVar9 = a6uVar.d;
                if (gbwVar9 != null) {
                    gbwVar9.stop();
                }
                a6uVar.f = h1b.e;
                break;
            default:
                nm6 nm6Var9 = nm6.a;
                qgg.h0(obj);
                ssg.a(3, "VideoClipPlayer", "unmute", null);
                float c = a6uVar.e.c();
                gbw gbwVar10 = a6uVar.d;
                if (gbwVar10 != null) {
                    gbwVar10.t(c);
                }
                a6u.y(a6uVar, a6uVar.h);
                break;
        }
        return Unit.a;
    }
}
