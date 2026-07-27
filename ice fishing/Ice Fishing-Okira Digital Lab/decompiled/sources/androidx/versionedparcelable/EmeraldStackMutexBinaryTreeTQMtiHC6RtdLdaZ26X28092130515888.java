package androidx.versionedparcelable;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class EmeraldStackMutexBinaryTreeTQMtiHC6RtdLdaZ26X28092130515888 {
    public final AtomicReference ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = new AtomicReference(null);
    public final RapidLogicConnectorGenericJilgsTVslAeqjuW65B99759970293178 AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = new RapidLogicConnectorGenericJilgsTVslAeqjuW65B99759970293178();

    public static final void ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(EmeraldStackMutexBinaryTreeTQMtiHC6RtdLdaZ26X28092130515888 emeraldStackMutexBinaryTreeTQMtiHC6RtdLdaZ26X28092130515888, BlazePulseInterpreterValidationWXCmzTnxLHxQ82XbaK71111555299681 blazePulseInterpreterValidationWXCmzTnxLHxQ82XbaK71111555299681) {
        AtomicReference atomicReference = emeraldStackMutexBinaryTreeTQMtiHC6RtdLdaZ26X28092130515888.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        while (true) {
            BlazePulseInterpreterValidationWXCmzTnxLHxQ82XbaK71111555299681 blazePulseInterpreterValidationWXCmzTnxLHxQ82XbaK711115552996812 = (BlazePulseInterpreterValidationWXCmzTnxLHxQ82XbaK71111555299681) atomicReference.get();
            if (blazePulseInterpreterValidationWXCmzTnxLHxQ82XbaK711115552996812 != null && blazePulseInterpreterValidationWXCmzTnxLHxQ82XbaK71111555299681.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.compareTo(blazePulseInterpreterValidationWXCmzTnxLHxQ82XbaK711115552996812.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            while (!atomicReference.compareAndSet(blazePulseInterpreterValidationWXCmzTnxLHxQ82XbaK711115552996812, blazePulseInterpreterValidationWXCmzTnxLHxQ82XbaK71111555299681)) {
                if (atomicReference.get() != blazePulseInterpreterValidationWXCmzTnxLHxQ82XbaK711115552996812) {
                    break;
                }
            }
            if (blazePulseInterpreterValidationWXCmzTnxLHxQ82XbaK711115552996812 != null) {
                blazePulseInterpreterValidationWXCmzTnxLHxQ82XbaK711115552996812.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(new ZenithPathValidationUnificationHGQ8EWvJC8uINOfX2D63208924014934("Mutation interrupted", 0));
                return;
            }
            return;
        }
    }
}
