package ru.rt.ebs.cryptosdk.core.verification.ebs.entities.models;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006j\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lru/rt/ebs/cryptosdk/core/verification/ebs/entities/models/BioSampleType;", "", "", "contentName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "contentType", "b", "fileName", "c", "PHOTO", "VIDEO", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes4.dex */
public final class BioSampleType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BioSampleType[] $VALUES;
    public static final BioSampleType PHOTO;
    public static final BioSampleType VIDEO;
    private final String contentName;
    private final String contentType;
    private final String fileName;

    static {
        BioSampleType bioSampleType = new BioSampleType("PHOTO", 0, "bs_photo", "image/jpeg", "bio_sample.jpeg");
        PHOTO = bioSampleType;
        BioSampleType bioSampleType2 = new BioSampleType("VIDEO", 1, "bs_video", "video/mp4", "bio_sample.mp4");
        VIDEO = bioSampleType2;
        BioSampleType[] bioSampleTypeArr = {bioSampleType, bioSampleType2};
        $VALUES = bioSampleTypeArr;
        $ENTRIES = a.a(bioSampleTypeArr);
    }

    public BioSampleType(String str, int i, String str2, String str3, String str4) {
        this.contentName = str2;
        this.contentType = str3;
        this.fileName = str4;
    }

    public static BioSampleType valueOf(String str) {
        return (BioSampleType) Enum.valueOf(BioSampleType.class, str);
    }

    public static BioSampleType[] values() {
        return (BioSampleType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getContentName() {
        return this.contentName;
    }

    /* renamed from: b, reason: from getter */
    public final String getContentType() {
        return this.contentType;
    }

    /* renamed from: c, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }
}
