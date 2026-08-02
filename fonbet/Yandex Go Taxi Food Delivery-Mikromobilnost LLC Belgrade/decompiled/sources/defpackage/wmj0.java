package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.b;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lwmj0;", "Ln96;", "Lc6z;", "Companion", "vmj0", "umj0", "go-client-android.features.requirements:models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class wmj0 extends n96 implements c6z {
    public static final vmj0 Companion = new vmj0();
    public static final i3y[] g = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new vci0(24)), null, null, null};
    public static final wmj0 h = new wmj0(0);
    public final boolean b;
    public final Map c;
    public final fnj0 d;
    public final wae e;
    public final hmj0 f;

    public wmj0(int i, boolean z, Map map, fnj0 fnj0Var, wae waeVar, hmj0 hmj0Var) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = b.f();
        } else {
            this.c = map;
        }
        if ((i & 4) == 0) {
            fnj0.Companion.getClass();
            this.d = fnj0.c;
        } else {
            this.d = fnj0Var;
        }
        if ((i & 8) == 0) {
            wae.Companion.getClass();
            this.e = wae.b;
        } else {
            this.e = waeVar;
        }
        if ((i & 16) != 0) {
            this.f = hmj0Var;
        } else {
            hmj0.Companion.getClass();
            this.f = hmj0.h;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getK() {
        return this.c;
    }

    public wmj0() {
        this(0);
    }

    public wmj0(int i) {
        Map f = b.f();
        fnj0.Companion.getClass();
        fnj0 fnj0Var = fnj0.c;
        wae.Companion.getClass();
        hmj0.Companion.getClass();
        hmj0 hmj0Var = hmj0.h;
        this.b = false;
        this.c = f;
        this.d = fnj0Var;
        this.e = wae.b;
        this.f = hmj0Var;
    }
}
