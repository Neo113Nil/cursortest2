package com.fidesmo.sec.core.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/fidesmo/sec/core/models/InstanceElement;", "", "image", "", "description", "Lcom/fidesmo/sec/core/models/ParametrisedTranslation;", "extraInfo", "Lcom/fidesmo/sec/core/models/ExtraInfo;", "(Ljava/lang/String;Lcom/fidesmo/sec/core/models/ParametrisedTranslation;Lcom/fidesmo/sec/core/models/ExtraInfo;)V", "getDescription", "()Lcom/fidesmo/sec/core/models/ParametrisedTranslation;", "getExtraInfo", "()Lcom/fidesmo/sec/core/models/ExtraInfo;", "getImage", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class InstanceElement {
    private final ParametrisedTranslation description;
    private final ExtraInfo extraInfo;
    private final String image;

    public /* synthetic */ InstanceElement(String str, ParametrisedTranslation parametrisedTranslation, ExtraInfo extraInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : parametrisedTranslation, (i & 4) != 0 ? null : extraInfo);
    }

    public static /* synthetic */ InstanceElement copy$default(InstanceElement instanceElement, String str, ParametrisedTranslation parametrisedTranslation, ExtraInfo extraInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = instanceElement.image;
        }
        if ((i & 2) != 0) {
            parametrisedTranslation = instanceElement.description;
        }
        if ((i & 4) != 0) {
            extraInfo = instanceElement.extraInfo;
        }
        return instanceElement.copy(str, parametrisedTranslation, extraInfo);
    }

    /* renamed from: component1, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* renamed from: component2, reason: from getter */
    public final ParametrisedTranslation getDescription() {
        return this.description;
    }

    /* renamed from: component3, reason: from getter */
    public final ExtraInfo getExtraInfo() {
        return this.extraInfo;
    }

    public final InstanceElement copy(String image, ParametrisedTranslation description, ExtraInfo extraInfo) {
        return new InstanceElement(image, description, extraInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstanceElement)) {
            return false;
        }
        InstanceElement instanceElement = (InstanceElement) other;
        return Intrinsics.areEqual(this.image, instanceElement.image) && Intrinsics.areEqual(this.description, instanceElement.description) && Intrinsics.areEqual(this.extraInfo, instanceElement.extraInfo);
    }

    public final ParametrisedTranslation getDescription() {
        return this.description;
    }

    public final ExtraInfo getExtraInfo() {
        return this.extraInfo;
    }

    public final String getImage() {
        return this.image;
    }

    public int hashCode() {
        String str = this.image;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        ParametrisedTranslation parametrisedTranslation = this.description;
        int hashCode2 = (hashCode + (parametrisedTranslation == null ? 0 : parametrisedTranslation.hashCode())) * 31;
        ExtraInfo extraInfo = this.extraInfo;
        return hashCode2 + (extraInfo != null ? extraInfo.hashCode() : 0);
    }

    public String toString() {
        return "InstanceElement(image=" + this.image + ", description=" + this.description + ", extraInfo=" + this.extraInfo + ')';
    }

    public InstanceElement(String str, ParametrisedTranslation parametrisedTranslation, ExtraInfo extraInfo) {
        this.image = str;
        this.description = parametrisedTranslation;
        this.extraInfo = extraInfo;
    }

    public InstanceElement() {
        this(null, null, null, 7, null);
    }
}
