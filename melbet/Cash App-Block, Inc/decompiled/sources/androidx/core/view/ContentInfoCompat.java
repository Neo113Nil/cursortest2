package androidx.core.view;

import android.content.ClipData;
import android.media.metrics.LogSessionId;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import androidx.core.graphics.TypefaceCompat$$ExternalSyntheticApiModelOutline0;
import androidx.room.TransactorKt;
import androidx.tracing.Trace;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.Json;

/* loaded from: classes3.dex */
public final class ContentInfoCompat {
    public final Compat mCompat;

    public interface BuilderCompat {
        ContentInfoCompat build();

        void setExtras(Bundle bundle);

        void setFlags(int i);

        void setLinkUri(Uri uri);
    }

    public interface Compat {
        ClipData getClip();

        int getFlags();

        int getSource();

        ContentInfo getWrapped();
    }

    public ContentInfoCompat(Compat compat) {
        this.mCompat = compat;
    }

    public final String toString() {
        return this.mCompat.toString();
    }

    public final class Compat31Impl implements BuilderCompat, Compat {
        public final /* synthetic */ int $r8$classId = 2;
        public Object mWrapped;

        public Compat31Impl() {
            LogSessionId logSessionId;
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            this.mWrapped = logSessionId;
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public ContentInfoCompat build() {
            return new ContentInfoCompat(new Compat31Impl(((ContentInfo.Builder) this.mWrapped).build()));
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public ClipData getClip() {
            return ((ContentInfo) this.mWrapped).getClip();
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public int getFlags() {
            return ((ContentInfo) this.mWrapped).getFlags();
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public int getSource() {
            return ((ContentInfo) this.mWrapped).getSource();
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public ContentInfo getWrapped() {
            return (ContentInfo) this.mWrapped;
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setExtras(Bundle bundle) {
            ((ContentInfo.Builder) this.mWrapped).setExtras(bundle);
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setFlags(int i) {
            ((ContentInfo.Builder) this.mWrapped).setFlags(i);
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setLinkUri(Uri uri) {
            ((ContentInfo.Builder) this.mWrapped).setLinkUri(uri);
        }

        public void setLogSessionId(LogSessionId logSessionId) {
            LogSessionId logSessionId2;
            LogSessionId logSessionId3 = (LogSessionId) this.mWrapped;
            logSessionId2 = LogSessionId.LOG_SESSION_ID_NONE;
            Trace.checkState(logSessionId3.equals(logSessionId2));
            this.mWrapped = logSessionId;
        }

        public String toString() {
            switch (this.$r8$classId) {
                case 0:
                    return "ContentInfoCompat{" + ((ContentInfo) this.mWrapped) + "}";
                default:
                    return super.toString();
            }
        }

        public Compat31Impl(ContentInfo contentInfo) {
            contentInfo.getClass();
            this.mWrapped = contentInfo;
        }

        public Compat31Impl(ClipData clipData, int i) {
            this.mWrapped = TypefaceCompat$$ExternalSyntheticApiModelOutline0.m(clipData, i);
        }
    }

    public final class CompatImpl implements BuilderCompat, Compat {
        public final /* synthetic */ int $r8$classId = 1;
        public Object mClip;
        public Cloneable mExtras;
        public int mFlags;
        public Object mLinkUri;
        public int mSource;

        public CompatImpl(CompatImpl compatImpl) {
            ClipData clipData = (ClipData) compatImpl.mClip;
            clipData.getClass();
            this.mClip = clipData;
            int i = compatImpl.mSource;
            TransactorKt.checkArgumentInRange(i, 0, 5, "source");
            this.mSource = i;
            int i2 = compatImpl.mFlags;
            if ((i2 & 1) != i2) {
                Drop$$ExternalSyntheticBUOutline0.m(Integer.toHexString(i2), ", but only 0x", Integer.toHexString(1), " are allowed", "Requested flags 0x");
                throw null;
            }
            this.mFlags = i2;
            this.mLinkUri = (Uri) compatImpl.mLinkUri;
            this.mExtras = (Bundle) compatImpl.mExtras;
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public ContentInfoCompat build() {
            return new ContentInfoCompat(new CompatImpl(this));
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public ClipData getClip() {
            return (ClipData) this.mClip;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public int getFlags() {
            return this.mFlags;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public int getSource() {
            return this.mSource;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public ContentInfo getWrapped() {
            return null;
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setExtras(Bundle bundle) {
            this.mExtras = bundle;
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setFlags(int i) {
            this.mFlags = i;
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setLinkUri(Uri uri) {
            this.mLinkUri = uri;
        }

        public String toString() {
            String str;
            switch (this.$r8$classId) {
                case 0:
                    Uri uri = (Uri) this.mLinkUri;
                    StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                    sb.append(((ClipData) this.mClip).getDescription());
                    sb.append(", source=");
                    int i = this.mSource;
                    sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                    sb.append(", flags=");
                    int i2 = this.mFlags;
                    sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                    if (uri == null) {
                        str = "";
                    } else {
                        str = ", hasLinkUri(" + uri.toString().length() + ")";
                    }
                    sb.append(str);
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, ((Bundle) this.mExtras) != null ? ", hasExtras" : "", "}");
                default:
                    return super.toString();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public CompatImpl(int i, int i2, Json json, Object[] objArr, KSerializer[] kSerializerArr) {
            this.mSource = i;
            this.mFlags = i2;
            this.mClip = json;
            this.mLinkUri = objArr;
            this.mExtras = kSerializerArr;
        }

        public /* synthetic */ CompatImpl() {
        }
    }
}
