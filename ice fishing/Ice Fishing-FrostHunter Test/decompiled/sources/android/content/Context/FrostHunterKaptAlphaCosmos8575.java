package android.content.Context;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterKaptAlphaCosmos8575 implements FrostHunterAdapterDelegateForceForce1151 {
    public volatile Set FrostHunterAlphaAnimationNeoCosmos5761;
    public volatile Set FrostHunterConstraintSetCloneMasterUltraRogue2633;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003f, code lost:
    
        throw r0;
     */
    @Override // android.content.Context.FrostHunterAdapterDelegateForceForce1151
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get() {
        if (this.FrostHunterConstraintSetCloneMasterUltraRogue2633 == null) {
            synchronized (this) {
                try {
                    if (this.FrostHunterConstraintSetCloneMasterUltraRogue2633 == null) {
                        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = Collections.newSetFromMap(new ConcurrentHashMap());
                        synchronized (this) {
                            Iterator it = this.FrostHunterAlphaAnimationNeoCosmos5761.iterator();
                            while (it.hasNext()) {
                                this.FrostHunterConstraintSetCloneMasterUltraRogue2633.add(((FrostHunterAdapterDelegateForceForce1151) it.next()).get());
                            }
                            this.FrostHunterAlphaAnimationNeoCosmos5761 = null;
                        }
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableSet(this.FrostHunterConstraintSetCloneMasterUltraRogue2633);
    }
}
