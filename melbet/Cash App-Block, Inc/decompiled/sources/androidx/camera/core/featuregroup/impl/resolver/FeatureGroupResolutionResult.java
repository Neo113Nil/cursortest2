package androidx.camera.core.featuregroup.impl.resolver;

import androidx.camera.core.UseCase;
import androidx.camera.core.featuregroup.GroupableFeature;
import androidx.camera.core.featuregroup.impl.ResolvedFeatureGroup;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public interface FeatureGroupResolutionResult {

    public final class Supported implements FeatureGroupResolutionResult {
        public final ResolvedFeatureGroup resolvedFeatureGroup;

        public Supported(ResolvedFeatureGroup resolvedFeatureGroup) {
            this.resolvedFeatureGroup = resolvedFeatureGroup;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Supported) && this.resolvedFeatureGroup == ((Supported) obj).resolvedFeatureGroup;
        }

        public final int hashCode() {
            return this.resolvedFeatureGroup.hashCode();
        }

        public final String toString() {
            return "Supported(resolvedFeatureGroup=" + this.resolvedFeatureGroup + ')';
        }
    }

    public final class Unsupported implements FeatureGroupResolutionResult {
        public static final Unsupported INSTANCE = new Unsupported();
    }

    public final class UnsupportedUseCase implements FeatureGroupResolutionResult {
        public final UseCase unsupportedUseCase;

        public UnsupportedUseCase(UseCase useCase) {
            this.unsupportedUseCase = useCase;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UnsupportedUseCase) && this.unsupportedUseCase.equals(((UnsupportedUseCase) obj).unsupportedUseCase);
        }

        public final int hashCode() {
            return this.unsupportedUseCase.hashCode();
        }

        public final String toString() {
            return "UnsupportedUseCase(unsupportedUseCase=" + this.unsupportedUseCase + ')';
        }
    }

    public final class UseCaseMissing implements FeatureGroupResolutionResult {
        public final GroupableFeature featureRequiring;
        public final String requiredUseCases;

        public UseCaseMissing(String str, GroupableFeature groupableFeature) {
            groupableFeature.getClass();
            this.requiredUseCases = str;
            this.featureRequiring = groupableFeature;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UseCaseMissing)) {
                return false;
            }
            UseCaseMissing useCaseMissing = (UseCaseMissing) obj;
            return this.requiredUseCases.equals(useCaseMissing.requiredUseCases) && Intrinsics.areEqual(this.featureRequiring, useCaseMissing.featureRequiring);
        }

        public final int hashCode() {
            return this.featureRequiring.hashCode() + (this.requiredUseCases.hashCode() * 31);
        }

        public final String toString() {
            return "UseCaseMissing(requiredUseCases=" + this.requiredUseCases + ", featureRequiring=" + this.featureRequiring + ')';
        }
    }
}
