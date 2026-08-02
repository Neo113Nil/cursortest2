package com.miteksystems.misnap.core;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes4.dex */
public final class MrzData extends Mrz {
    public static final Companion Companion = new Companion();
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/core/MrzData$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/MrzData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return MrzData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MrzData(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        if (31 != (i & 31)) {
            TuplesKt.throwMissingFieldException(i, 31, MrzData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        if ((i & 32) == 0) {
            this.g = "<<<<<<<<<<<<<<";
        } else {
            this.g = str6;
        }
        if ((i & 64) == 0) {
            this.h = "";
        } else {
            this.h = str7;
        }
        if ((i & 128) == 0) {
            this.i = "";
        } else {
            this.i = str8;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MrzData)) {
            return false;
        }
        MrzData mrzData = (MrzData) obj;
        return Intrinsics.areEqual(this.b, mrzData.b) && Intrinsics.areEqual(this.c, mrzData.c) && Intrinsics.areEqual(this.d, mrzData.d) && Intrinsics.areEqual(this.e, mrzData.e) && Intrinsics.areEqual(this.f, mrzData.f) && Intrinsics.areEqual(this.g, mrzData.g) && Intrinsics.areEqual(this.h, mrzData.h) && Intrinsics.areEqual(this.i, mrzData.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MrzData(documentNumber=");
        sb.append(this.b);
        sb.append(", dateOfBirth=");
        sb.append(this.c);
        sb.append(", dateOfExpiry=");
        sb.append(this.d);
        sb.append(", country=");
        sb.append(this.e);
        sb.append(", documentCode=");
        sb.append(this.f);
        sb.append(", optionalData1=");
        sb.append(this.g);
        sb.append(", nationality=");
        sb.append(this.h);
        sb.append(", rawData=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.i, ')');
    }

    public MrzData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        BalanceFeedKt$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str5);
        re$$ExternalSyntheticOutline0.m1432m(str6, str7, str8);
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
    }
}
