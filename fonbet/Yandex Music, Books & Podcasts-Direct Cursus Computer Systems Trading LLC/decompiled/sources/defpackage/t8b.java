package defpackage;

import androidx.compose.animation.c;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class t8b extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ e9b s;
    public final /* synthetic */ vpb t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t8b(e9b e9bVar, vpb vpbVar, int i) {
        super(1);
        this.r = i;
        this.s = e9bVar;
        this.t = vpbVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005c, code lost:
    
        if (r3.t.a.a != null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006c, code lost:
    
        if (r3.s.a.a != null) goto L35;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        wdc wdcVar;
        wdc wdcVar2;
        switch (this.r) {
            case 0:
                x7t x7tVar = (x7t) obj;
                r8b r8bVar = r8b.a;
                r8b r8bVar2 = r8b.b;
                if (x7tVar.c(r8bVar, r8bVar2)) {
                    y3c y3cVar = this.s.a.a;
                    return (y3cVar == null || (wdcVar2 = y3cVar.a) == null) ? c.b : wdcVar2;
                }
                if (!x7tVar.c(r8bVar2, r8b.c)) {
                    return c.b;
                }
                y3c y3cVar2 = this.t.a.a;
                return (y3cVar2 == null || (wdcVar = y3cVar2.a) == null) ? c.b : wdcVar;
            case 1:
                int ordinal = ((r8b) obj).ordinal();
                float f = 0.0f;
                if (ordinal == 0) {
                    break;
                } else {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            b6e.s();
                            return null;
                        }
                        break;
                    }
                    f = 1.0f;
                }
                return Float.valueOf(f);
            case 2:
                x7t x7tVar2 = (x7t) obj;
                r8b r8bVar3 = r8b.a;
                r8b r8bVar4 = r8b.b;
                if (x7tVar2.c(r8bVar3, r8bVar4)) {
                    return c.b;
                }
                if (!x7tVar2.c(r8bVar4, r8b.c)) {
                    return c.b;
                }
                g8t g8tVar = this.t.a;
                return c.b;
            default:
                int ordinal2 = ((r8b) obj).ordinal();
                if (ordinal2 != 0 && ordinal2 != 1) {
                    if (ordinal2 != 2) {
                        b6e.s();
                        return null;
                    }
                    g8t g8tVar2 = this.t.a;
                }
                return Float.valueOf(1.0f);
        }
    }
}
