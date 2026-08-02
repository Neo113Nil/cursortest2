package com.squareup.cash.crypto.backend.stablecoin;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.protos.franklin.common.ResponseContext;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface StablecoinNetworksResult {

    public final class Error implements StablecoinNetworksResult {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Error);
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Error(message=null)";
        }
    }

    public final class NeedsPlasmaFlow implements StablecoinNetworksResult {
        public final ResponseContext responseContext;

        public NeedsPlasmaFlow(ResponseContext responseContext) {
            responseContext.getClass();
            this.responseContext = responseContext;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NeedsPlasmaFlow) && Intrinsics.areEqual(this.responseContext, ((NeedsPlasmaFlow) obj).responseContext);
        }

        public final int hashCode() {
            return this.responseContext.hashCode();
        }

        public final String toString() {
            return "NeedsPlasmaFlow(responseContext=" + this.responseContext + ")";
        }
    }

    /* loaded from: classes7.dex */
    public final class Success implements StablecoinNetworksResult {
        public final List options;

        public Success(ArrayList arrayList) {
            arrayList.getClass();
            this.options = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.areEqual(this.options, ((Success) obj).options);
        }

        public final int hashCode() {
            return this.options.hashCode();
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("Success(options=", ")", this.options);
        }
    }
}
