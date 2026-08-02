package com.miteksystems.misnap.core;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class DocumentData {
    public static final Companion Companion = new Companion();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/core/DocumentData$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/DocumentData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return DocumentData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DocumentData(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str5;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str6;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str7;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str8;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str9;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str10;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str11;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = str12;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DocumentData)) {
            return false;
        }
        DocumentData documentData = (DocumentData) obj;
        return Intrinsics.areEqual(this.a, documentData.a) && Intrinsics.areEqual(this.b, documentData.b) && Intrinsics.areEqual(this.c, documentData.c) && Intrinsics.areEqual(this.d, documentData.d) && Intrinsics.areEqual(this.e, documentData.e) && Intrinsics.areEqual(this.f, documentData.f) && Intrinsics.areEqual(this.g, documentData.g) && Intrinsics.areEqual(this.h, documentData.h) && Intrinsics.areEqual(this.i, documentData.i) && Intrinsics.areEqual(this.j, documentData.j) && Intrinsics.areEqual(this.k, documentData.k) && Intrinsics.areEqual(this.l, documentData.l);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.g;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.h;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.i;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.j;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.k;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.l;
        return hashCode11 + (str12 != null ? str12.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DocumentData(docType=");
        sb.append(this.a);
        sb.append(", country=");
        sb.append(this.b);
        sb.append(", surname=");
        sb.append(this.c);
        sb.append(", firstName=");
        sb.append(this.d);
        sb.append(", docNumber=");
        sb.append(this.e);
        sb.append(", nationality=");
        sb.append(this.f);
        sb.append(", dateOfBirth=");
        sb.append(this.g);
        sb.append(", sex=");
        sb.append(this.h);
        sb.append(", dateOfExpiration=");
        sb.append(this.i);
        sb.append(", optionalData1=");
        sb.append(this.j);
        sb.append(", optionalData2=");
        sb.append(this.k);
        sb.append(", rawData=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.l, ')');
    }

    public DocumentData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = str10;
        this.k = str11;
        this.l = str12;
    }
}
