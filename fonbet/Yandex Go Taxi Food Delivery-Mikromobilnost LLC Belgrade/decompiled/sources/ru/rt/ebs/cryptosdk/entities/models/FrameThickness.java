package ru.rt.ebs.cryptosdk.entities.models;

import defpackage.k4o;
import defpackage.nfs;
import defpackage.owg0;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lru/rt/ebs/cryptosdk/entities/models/FrameThickness;", "", "", "dimenRes", CA20Status.STATUS_USER_I, "a", "()I", "Companion", "nfs", "DP_4", "DP_5", "DP_6", "cryptosdk_prodRelease"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes4.dex */
public final class FrameThickness {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FrameThickness[] $VALUES;
    public static final nfs Companion;
    public static final FrameThickness DP_4;
    public static final FrameThickness DP_5;
    public static final FrameThickness DP_6;
    private final int dimenRes;

    static {
        FrameThickness frameThickness = new FrameThickness("DP_4", 0, owg0.ebssdk_frame_thickness_4);
        DP_4 = frameThickness;
        FrameThickness frameThickness2 = new FrameThickness("DP_5", 1, owg0.ebssdk_frame_thickness_5);
        DP_5 = frameThickness2;
        FrameThickness frameThickness3 = new FrameThickness("DP_6", 2, owg0.ebssdk_frame_thickness_6);
        DP_6 = frameThickness3;
        FrameThickness[] frameThicknessArr = {frameThickness, frameThickness2, frameThickness3};
        $VALUES = frameThicknessArr;
        $ENTRIES = a.a(frameThicknessArr);
        Companion = new nfs();
    }

    public FrameThickness(String str, int i, int i2) {
        this.dimenRes = i2;
    }

    public static FrameThickness valueOf(String str) {
        return (FrameThickness) Enum.valueOf(FrameThickness.class, str);
    }

    public static FrameThickness[] values() {
        return (FrameThickness[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getDimenRes() {
        return this.dimenRes;
    }
}
