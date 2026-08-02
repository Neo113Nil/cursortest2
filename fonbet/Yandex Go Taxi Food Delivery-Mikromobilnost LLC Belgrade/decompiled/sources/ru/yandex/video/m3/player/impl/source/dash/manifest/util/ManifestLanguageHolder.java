package ru.yandex.video.m3.player.impl.source.dash.manifest.util;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.a;
import defpackage.b64;
import defpackage.jl40;
import defpackage.qe10;
import defpackage.s820;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000b\u0010\bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\b¨\u0006\u001d"}, d2 = {"Lru/yandex/video/m3/player/impl/source/dash/manifest/util/ManifestLanguageHolder;", "Ls820;", "Landroid/os/Parcelable;", "", "language", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lru/yandex/video/m3/player/impl/source/dash/manifest/util/ManifestLanguageHolder;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getLanguage", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ManifestLanguageHolder implements s820, Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<ManifestLanguageHolder> CREATOR = new Creator();
    private final String language;

    public ManifestLanguageHolder(String str) {
        this.language = str;
    }

    public static /* synthetic */ ManifestLanguageHolder copy$default(ManifestLanguageHolder manifestLanguageHolder, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = manifestLanguageHolder.language;
        }
        return manifestLanguageHolder.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    public final ManifestLanguageHolder copy(String language) {
        return new ManifestLanguageHolder(language);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ManifestLanguageHolder) && jl40.l(this.language, ((ManifestLanguageHolder) other).language);
    }

    public final String getLanguage() {
        return this.language;
    }

    @Override // defpackage.s820
    public /* bridge */ /* synthetic */ byte[] getWrappedMetadataBytes() {
        return null;
    }

    @Override // defpackage.s820
    public /* bridge */ /* synthetic */ a getWrappedMetadataFormat() {
        return null;
    }

    public int hashCode() {
        return this.language.hashCode();
    }

    @Override // defpackage.s820
    public /* bridge */ /* synthetic */ void populateMediaMetadata(qe10 qe10Var) {
    }

    public String toString() {
        return b64.p(new StringBuilder("ManifestLanguageHolder(language="), this.language, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeString(this.language);
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ManifestLanguageHolder> {
        @Override // android.os.Parcelable.Creator
        public final ManifestLanguageHolder createFromParcel(Parcel parcel) {
            return new ManifestLanguageHolder(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ManifestLanguageHolder[] newArray(int i) {
            return new ManifestLanguageHolder[i];
        }
    }
}
