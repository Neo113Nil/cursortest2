package com.squareup.cash.moneybot.backend.api.model.chat;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface ChatActivity {

    public final class ClientRenderingUpdateActivity implements ChatActivity {
        public final ClientRenderable clientRenderable;
        public final long createdAtMs;
        public final String id;
        public final String toolRequestId;

        public ClientRenderingUpdateActivity(String str, long j, String str2, ClientRenderable clientRenderable) {
            str2.getClass();
            this.id = str;
            this.createdAtMs = j;
            this.toolRequestId = str2;
            this.clientRenderable = clientRenderable;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClientRenderingUpdateActivity)) {
                return false;
            }
            ClientRenderingUpdateActivity clientRenderingUpdateActivity = (ClientRenderingUpdateActivity) obj;
            return Intrinsics.areEqual(this.id, clientRenderingUpdateActivity.id) && this.createdAtMs == clientRenderingUpdateActivity.createdAtMs && Intrinsics.areEqual(this.toolRequestId, clientRenderingUpdateActivity.toolRequestId) && this.clientRenderable.equals(clientRenderingUpdateActivity.clientRenderable);
        }

        public final int hashCode() {
            String str = this.id;
            return this.clientRenderable.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m((str == null ? 0 : str.hashCode()) * 31, 31, this.createdAtMs), 31, this.toolRequestId);
        }

        public final String toString() {
            StringBuilder m = re$$ExternalSyntheticOutline0.m("ClientRenderingUpdateActivity(id=", this.id, ", createdAtMs=", this.createdAtMs);
            m.append(", toolRequestId=");
            m.append(this.toolRequestId);
            m.append(", clientRenderable=");
            m.append(this.clientRenderable);
            m.append(")");
            return m.toString();
        }
    }

    public final class MemoryUpdateActivity implements ChatActivity {
        public final long createdAtMs;
        public final String id;
        public final String label;
        public final String originMessageId;

        public MemoryUpdateActivity(String str, long j, String str2, String str3) {
            this.id = str;
            this.createdAtMs = j;
            this.originMessageId = str2;
            this.label = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MemoryUpdateActivity)) {
                return false;
            }
            MemoryUpdateActivity memoryUpdateActivity = (MemoryUpdateActivity) obj;
            return Intrinsics.areEqual(this.id, memoryUpdateActivity.id) && this.createdAtMs == memoryUpdateActivity.createdAtMs && this.originMessageId.equals(memoryUpdateActivity.originMessageId) && this.label.equals(memoryUpdateActivity.label);
        }

        public final int hashCode() {
            String str = this.id;
            return this.label.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m((str == null ? 0 : str.hashCode()) * 31, 961, this.createdAtMs), 31, this.originMessageId);
        }

        public final String toString() {
            StringBuilder m = re$$ExternalSyntheticOutline0.m("MemoryUpdateActivity(id=", this.id, ", createdAtMs=", this.createdAtMs);
            Boxes$$ExternalSyntheticOutline1.m(m, ", toolRequestId=null, originMessageId=", this.originMessageId, ", label=", this.label);
            m.append(")");
            return m.toString();
        }
    }
}
