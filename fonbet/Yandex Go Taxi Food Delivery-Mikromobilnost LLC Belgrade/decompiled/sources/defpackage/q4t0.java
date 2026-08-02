package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import kotlinx.serialization.json.d;

/* loaded from: classes9.dex */
public final class q4t0 implements KSerializer {
    public static final q4t0 b = new q4t0(0);
    public static final q4t0 c = new q4t0(1);
    public final /* synthetic */ int a;

    public /* synthetic */ q4t0(int i) {
        this.a = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        KSerializer serializer;
        switch (this.a) {
            case 0:
                b t = ((ncx) decoder).t();
                if (t instanceof d) {
                    String a = ((d) t).a();
                    switch (a.hashCode()) {
                        case -1121226297:
                            if (a.equals("stickyForDocumentStart")) {
                                return new w4t0();
                            }
                            break;
                        case -638106789:
                            if (a.equals("stickyForDocument")) {
                                return new w4t0();
                            }
                            break;
                        case -314029184:
                            if (a.equals("stickyForDocumentEnd")) {
                                return new t4t0();
                            }
                            break;
                        case -101993561:
                            if (a.equals("fillStartSpace")) {
                                return new f4t0(0);
                            }
                            break;
                        case 284785724:
                            if (a.equals("snapping")) {
                                return new l4t0(null, null, null);
                            }
                            break;
                        case 679014286:
                            if (a.equals("fillEndSpace")) {
                                return new c4t0(0);
                            }
                            break;
                        case 1086463900:
                            if (a.equals("regular")) {
                                return g4t0.INSTANCE;
                            }
                            break;
                    }
                    ny61.g("Unexpected element ".concat(a));
                    return null;
                }
                if (!(t instanceof c)) {
                    ny61.g(qv10.l(t.getClass(), "Unexpected element "));
                    return null;
                }
                String a2 = qcx.n((b) ((c) t).get("type")).a();
                switch (a2.hashCode()) {
                    case -1121226297:
                        if (a2.equals("stickyForDocumentStart")) {
                            serializer = w4t0.Companion.serializer();
                            return (x4t0) serializer.deserialize(decoder);
                        }
                        ny61.g("Unexpected element ".concat(a2));
                        return null;
                    case -638106789:
                        if (a2.equals("stickyForDocument")) {
                            serializer = w4t0.Companion.serializer();
                            return (x4t0) serializer.deserialize(decoder);
                        }
                        ny61.g("Unexpected element ".concat(a2));
                        return null;
                    case -314029184:
                        if (a2.equals("stickyForDocumentEnd")) {
                            serializer = t4t0.Companion.serializer();
                            return (x4t0) serializer.deserialize(decoder);
                        }
                        ny61.g("Unexpected element ".concat(a2));
                        return null;
                    case -101993561:
                        if (a2.equals("fillStartSpace")) {
                            serializer = f4t0.Companion.serializer();
                            return (x4t0) serializer.deserialize(decoder);
                        }
                        ny61.g("Unexpected element ".concat(a2));
                        return null;
                    case 284785724:
                        if (a2.equals("snapping")) {
                            serializer = l4t0.Companion.serializer();
                            return (x4t0) serializer.deserialize(decoder);
                        }
                        ny61.g("Unexpected element ".concat(a2));
                        return null;
                    case 679014286:
                        if (a2.equals("fillEndSpace")) {
                            serializer = c4t0.Companion.serializer();
                            return (x4t0) serializer.deserialize(decoder);
                        }
                        ny61.g("Unexpected element ".concat(a2));
                        return null;
                    case 1086463900:
                        if (a2.equals("regular")) {
                            serializer = g4t0.INSTANCE.serializer();
                            return (x4t0) serializer.deserialize(decoder);
                        }
                        ny61.g("Unexpected element ".concat(a2));
                        return null;
                    default:
                        ny61.g("Unexpected element ".concat(a2));
                        return null;
                }
            default:
                kf5 a3 = decoder.a();
                g0c a4 = qoi0.a(un11.class);
                List list = EmptyList.a;
                p53 p53Var = new p53(a3.b(a4, list), 0);
                SerialDescriptor descriptor = getDescriptor();
                sjd b2 = decoder.b(descriptor);
                while (true) {
                    q4t0 q4t0Var = c;
                    int v = b2.v(q4t0Var.getDescriptor());
                    if (v == -1) {
                        zn11.Companion.getClass();
                        zn11 a5 = tn11.a(list);
                        b2.c(descriptor);
                        return a5;
                    }
                    if (v != 0) {
                        yci0.m(oyr.i(v, "Unknown index received in TypedExperiments.Serializer: "));
                        return null;
                    }
                    list = (List) b2.A(q4t0Var.getDescriptor(), v, p53Var, null);
                }
        }
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        switch (this.a) {
            case 0:
                return d6z.f("SnippetBehaviour", new SerialDescriptor[0], new q2m0(28));
            default:
                return d6z.f("ru.yandex.taxi.common_models.net.TypedExperiments", new SerialDescriptor[0], new ceu0(17));
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        switch (this.a) {
            case 0:
                x4t0.Companion.serializer().serialize(encoder, (x4t0) obj);
                break;
            default:
                encoder.y();
                break;
        }
    }
}
