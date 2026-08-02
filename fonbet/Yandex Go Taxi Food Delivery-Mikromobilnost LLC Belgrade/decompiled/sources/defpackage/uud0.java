package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.yandex.taxi.common_models.net.map_object.Trigger;
import ru.yandex.taxi.common_models.net.map_object.d0;
import ru.yandex.taxi.common_models.net.map_object.o;
import ru.yandex.taxi.common_models.net.map_object.r0;
import ru.yandex.taxi.common_models.net.map_object.z;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0017\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Luud0;", "", "Companion", "sud0", "tud0", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public class uud0 {
    public static final tud0 Companion = new tud0();
    public static final i3y[] d;
    public final List a;
    public final Trigger b;
    public final boolean c;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        d = new i3y[]{a.b(lazyThreadSafetyMode, new bbd0(27)), a.b(lazyThreadSafetyMode, new bbd0(28)), null};
    }

    public /* synthetic */ uud0(int i, List list, Trigger trigger, boolean z) {
        this.a = (i & 1) == 0 ? EmptyList.a : list;
        if ((i & 2) == 0) {
            this.b = Trigger.UNKNOWN;
        } else {
            this.b = trigger;
        }
        if ((i & 4) == 0) {
            this.c = false;
        } else {
            this.c = z;
        }
    }

    public static final /* synthetic */ void h(uud0 uud0Var, yjd yjdVar, SerialDescriptor serialDescriptor) {
        boolean F = yjdVar.F();
        i3y[] i3yVarArr = d;
        if (F || !jl40.l(uud0Var.a, EmptyList.a)) {
            yjdVar.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), uud0Var.a);
        }
        if (yjdVar.F() || uud0Var.b != Trigger.UNKNOWN) {
            yjdVar.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), uud0Var.b);
        }
        if (yjdVar.F() || uud0Var.c) {
            yjdVar.n(serialDescriptor, 2, uud0Var.c);
        }
    }

    /* renamed from: b, reason: from getter */
    public final List getA() {
        return this.a;
    }

    public final o c() {
        Object obj;
        Iterator it = this.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            z zVar = (z) obj;
            if (zVar != null ? zVar instanceof o : true) {
                break;
            }
        }
        return (o) obj;
    }

    public final d0 d() {
        Object obj;
        Iterator it = this.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            z zVar = (z) obj;
            if (zVar != null ? zVar instanceof d0 : true) {
                break;
            }
        }
        return (d0) obj;
    }

    public final r0 e() {
        Object obj;
        Iterator it = this.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            z zVar = (z) obj;
            if (zVar != null ? zVar instanceof r0 : true) {
                break;
            }
        }
        return (r0) obj;
    }

    /* renamed from: f, reason: from getter */
    public final Trigger getB() {
        return this.b;
    }

    public final boolean g(Trigger trigger) {
        Trigger trigger2 = this.b;
        return trigger2 == trigger || trigger2 == Trigger.SELECT;
    }

    public uud0() {
        this(null, 7);
    }

    public uud0(List list, Trigger trigger, boolean z) {
        this.a = list;
        this.b = trigger;
        this.c = z;
    }

    public /* synthetic */ uud0(List list, int i) {
        this((i & 1) != 0 ? EmptyList.a : list, Trigger.UNKNOWN, false);
    }
}
