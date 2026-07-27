package androidx.versionedparcelable;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class AxiomCoreSingletonParserSeEPnBL6RwX4kGOyA911382900245051 implements NovaLayerGatewayObjectFBkKeWb1FgRSmzyc6t57393841945158 {
    public volatile Set AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
    public volatile Set ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003f, code lost:
    
        throw r0;
     */
    @Override // androidx.versionedparcelable.NovaLayerGatewayObjectFBkKeWb1FgRSmzyc6t57393841945158
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get() {
        if (this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 == null) {
            synchronized (this) {
                try {
                    if (this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 == null) {
                        this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = Collections.newSetFromMap(new ConcurrentHashMap());
                        synchronized (this) {
                            Iterator it = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.iterator();
                            while (it.hasNext()) {
                                this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.add(((NovaLayerGatewayObjectFBkKeWb1FgRSmzyc6t57393841945158) it.next()).get());
                            }
                            this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = null;
                        }
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableSet(this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365);
    }
}
