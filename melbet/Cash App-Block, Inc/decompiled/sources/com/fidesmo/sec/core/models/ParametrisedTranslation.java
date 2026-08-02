package com.fidesmo.sec.core.models;

import android.util.Log;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.text.MessageFormat;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003¢\u0006\u0002\u0010\u000bJ2\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0006\u0010\u0016\u001a\u00020\u0003J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\t¨\u0006\u001a"}, d2 = {"Lcom/fidesmo/sec/core/models/ParametrisedTranslation;", "", "id", "", "text", "params", "", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getParams", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getText", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lcom/fidesmo/sec/core/models/ParametrisedTranslation;", "equals", "", "other", "getFormattedText", "hashCode", "", "toString", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ParametrisedTranslation {
    private final String id;
    private final String[] params;
    private final String text;

    public /* synthetic */ ParametrisedTranslation(String str, String str2, String[] strArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "default-id" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? new String[0] : strArr);
    }

    public static /* synthetic */ ParametrisedTranslation copy$default(ParametrisedTranslation parametrisedTranslation, String str, String str2, String[] strArr, int i, Object obj) {
        if ((i & 1) != 0) {
            str = parametrisedTranslation.id;
        }
        if ((i & 2) != 0) {
            str2 = parametrisedTranslation.text;
        }
        if ((i & 4) != 0) {
            strArr = parametrisedTranslation.params;
        }
        return parametrisedTranslation.copy(str, str2, strArr);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component3, reason: from getter */
    public final String[] getParams() {
        return this.params;
    }

    public final ParametrisedTranslation copy(String id, String text, String[] params) {
        id.getClass();
        text.getClass();
        params.getClass();
        return new ParametrisedTranslation(id, text, params);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!ParametrisedTranslation.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        ParametrisedTranslation parametrisedTranslation = (ParametrisedTranslation) other;
        return Intrinsics.areEqual(this.id, parametrisedTranslation.id) && Intrinsics.areEqual(this.text, parametrisedTranslation.text) && Arrays.equals(this.params, parametrisedTranslation.params);
    }

    public final String getFormattedText() {
        String str;
        int length = this.params.length;
        String str2 = this.text;
        if (length == 0) {
            return str2;
        }
        try {
            String replace$default = StringsKt__StringsJVMKt.replace$default(str2, "'", "''");
            String[] strArr = this.params;
            str = MessageFormat.format(replace$default, Arrays.copyOf(strArr, strArr.length));
        } catch (Throwable th) {
            Log.d("ParametrisedTranslation", "Message formatting failed with error " + th);
            str = this.text;
        }
        return str == null ? this.text : str;
    }

    public final String getId() {
        return this.id;
    }

    public final String[] getParams() {
        return this.params;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.text) + Arrays.hashCode(this.params);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ParametrisedTranslation(id=");
        sb.append(this.id);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", params=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, Arrays.toString(this.params), ')');
    }

    public ParametrisedTranslation(String str, String str2, String[] strArr) {
        str.getClass();
        str2.getClass();
        strArr.getClass();
        this.id = str;
        this.text = str2;
        this.params = strArr;
    }

    public ParametrisedTranslation() {
        this(null, null, null, 7, null);
    }
}
