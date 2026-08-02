package ru.rt.ebs.cryptosdk.core.verification.ebs.entities.models;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lru/rt/ebs/cryptosdk/core/verification/ebs/entities/models/BioCollectionType;", "", "", "mnemonic", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Lru/rt/ebs/cryptosdk/core/verification/ebs/entities/models/BioSampleType;", "bioSampleType", "Lru/rt/ebs/cryptosdk/core/verification/ebs/entities/models/BioSampleType;", "a", "()Lru/rt/ebs/cryptosdk/core/verification/ebs/entities/models/BioSampleType;", "FACE_ONLY", "FACE_WITH_PASSIVE_LIVENESS", "FACE_WITH_ACTIVE_LIVENESS", "FACE_WITH_ALL_LIVENESS", "FACE_AND_VOICE_WITH_ACTIVE_LIVENESS", "FACE_AND_VOICE_WITH_ALL_LIVENESS", "FACE_ONLY_AGE", "FACE_WITH_PASSIVE_LIVENESS_AGE", "FACE_WITH_ACTIVE_LIVENESS_AGE", "FACE_WITH_ALL_LIVENESS_AGE", "FACE_AND_VOICE_WITH_ACTIVE_LIVENESS_AGE", "FACE_AND_VOICE_WITH_ALL_LIVENESS_AGE", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes4.dex */
public final class BioCollectionType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BioCollectionType[] $VALUES;
    public static final BioCollectionType FACE_AND_VOICE_WITH_ACTIVE_LIVENESS;
    public static final BioCollectionType FACE_AND_VOICE_WITH_ACTIVE_LIVENESS_AGE;
    public static final BioCollectionType FACE_AND_VOICE_WITH_ALL_LIVENESS;
    public static final BioCollectionType FACE_AND_VOICE_WITH_ALL_LIVENESS_AGE;
    public static final BioCollectionType FACE_ONLY;
    public static final BioCollectionType FACE_ONLY_AGE;
    public static final BioCollectionType FACE_WITH_ACTIVE_LIVENESS;
    public static final BioCollectionType FACE_WITH_ACTIVE_LIVENESS_AGE;
    public static final BioCollectionType FACE_WITH_ALL_LIVENESS;
    public static final BioCollectionType FACE_WITH_ALL_LIVENESS_AGE;
    public static final BioCollectionType FACE_WITH_PASSIVE_LIVENESS;
    public static final BioCollectionType FACE_WITH_PASSIVE_LIVENESS_AGE;
    private final BioSampleType bioSampleType;
    private final String mnemonic;

    static {
        BioSampleType bioSampleType = BioSampleType.PHOTO;
        BioCollectionType bioCollectionType = new BioCollectionType("FACE_ONLY", 0, "face_only_with_webinterface", bioSampleType);
        FACE_ONLY = bioCollectionType;
        BioCollectionType bioCollectionType2 = new BioCollectionType("FACE_WITH_PASSIVE_LIVENESS", 1, "face_with_passive_liveness_and_webinterface", bioSampleType);
        FACE_WITH_PASSIVE_LIVENESS = bioCollectionType2;
        BioSampleType bioSampleType2 = BioSampleType.VIDEO;
        BioCollectionType bioCollectionType3 = new BioCollectionType("FACE_WITH_ACTIVE_LIVENESS", 2, "face_with_active_liveness_and_webinterface", bioSampleType2);
        FACE_WITH_ACTIVE_LIVENESS = bioCollectionType3;
        BioCollectionType bioCollectionType4 = new BioCollectionType("FACE_WITH_ALL_LIVENESS", 3, "face_with_all_liveness_and_webinterface", bioSampleType2);
        FACE_WITH_ALL_LIVENESS = bioCollectionType4;
        BioCollectionType bioCollectionType5 = new BioCollectionType("FACE_AND_VOICE_WITH_ACTIVE_LIVENESS", 4, "face_and_voice_with_active_liveness_and_webinterface", bioSampleType2);
        FACE_AND_VOICE_WITH_ACTIVE_LIVENESS = bioCollectionType5;
        BioCollectionType bioCollectionType6 = new BioCollectionType("FACE_AND_VOICE_WITH_ALL_LIVENESS", 5, "face_and_voice_with_all_liveness_and_webinterface", bioSampleType2);
        FACE_AND_VOICE_WITH_ALL_LIVENESS = bioCollectionType6;
        BioCollectionType bioCollectionType7 = new BioCollectionType("FACE_ONLY_AGE", 6, "face_only_with_webinterface_age", bioSampleType);
        FACE_ONLY_AGE = bioCollectionType7;
        BioCollectionType bioCollectionType8 = new BioCollectionType("FACE_WITH_PASSIVE_LIVENESS_AGE", 7, "face_with_passive_liveness_and_webinterface_age", bioSampleType);
        FACE_WITH_PASSIVE_LIVENESS_AGE = bioCollectionType8;
        BioCollectionType bioCollectionType9 = new BioCollectionType("FACE_WITH_ACTIVE_LIVENESS_AGE", 8, "face_with_active_liveness_and_webinterface_age", bioSampleType2);
        FACE_WITH_ACTIVE_LIVENESS_AGE = bioCollectionType9;
        BioCollectionType bioCollectionType10 = new BioCollectionType("FACE_WITH_ALL_LIVENESS_AGE", 9, "face_with_all_liveness_and_webinterface_age", bioSampleType2);
        FACE_WITH_ALL_LIVENESS_AGE = bioCollectionType10;
        BioCollectionType bioCollectionType11 = new BioCollectionType("FACE_AND_VOICE_WITH_ACTIVE_LIVENESS_AGE", 10, "face_and_voice_with_active_liveness_and_webinterface_age", bioSampleType2);
        FACE_AND_VOICE_WITH_ACTIVE_LIVENESS_AGE = bioCollectionType11;
        BioCollectionType bioCollectionType12 = new BioCollectionType("FACE_AND_VOICE_WITH_ALL_LIVENESS_AGE", 11, "face_and_voice_with_all_liveness_and_webinterface_age", bioSampleType2);
        FACE_AND_VOICE_WITH_ALL_LIVENESS_AGE = bioCollectionType12;
        BioCollectionType[] bioCollectionTypeArr = {bioCollectionType, bioCollectionType2, bioCollectionType3, bioCollectionType4, bioCollectionType5, bioCollectionType6, bioCollectionType7, bioCollectionType8, bioCollectionType9, bioCollectionType10, bioCollectionType11, bioCollectionType12};
        $VALUES = bioCollectionTypeArr;
        $ENTRIES = a.a(bioCollectionTypeArr);
    }

    public BioCollectionType(String str, int i, String str2, BioSampleType bioSampleType) {
        this.mnemonic = str2;
        this.bioSampleType = bioSampleType;
    }

    public static k4o b() {
        return $ENTRIES;
    }

    public static BioCollectionType valueOf(String str) {
        return (BioCollectionType) Enum.valueOf(BioCollectionType.class, str);
    }

    public static BioCollectionType[] values() {
        return (BioCollectionType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final BioSampleType getBioSampleType() {
        return this.bioSampleType;
    }

    /* renamed from: c, reason: from getter */
    public final String getMnemonic() {
        return this.mnemonic;
    }
}
