package com.squareup.cash.graphics.swampgl.components;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes6.dex */
public interface Material {

    public final class ProgramSource {
        public final String fragmentShader;
        public final String vertexShader;

        public ProgramSource(String str, String str2) {
            this.vertexShader = str;
            this.fragmentShader = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProgramSource)) {
                return false;
            }
            ProgramSource programSource = (ProgramSource) obj;
            return this.vertexShader.equals(programSource.vertexShader) && this.fragmentShader.equals(programSource.fragmentShader);
        }

        public final int hashCode() {
            return this.fragmentShader.hashCode() + (this.vertexShader.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("ProgramSource(vertexShader=", this.vertexShader, ", fragmentShader=", this.fragmentShader, ")");
        }
    }

    void bind(RealUniformBinder realUniformBinder);

    Flow getDirty();

    ProgramSource getProgramSource();

    StateFlow getReady();
}
