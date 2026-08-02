package androidx.compose.ui.layout;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public interface ContentScale {

    public final class Companion {
        public static final ContentScale$Companion$Fit$1 Crop;
        public static final ContentScale$Companion$Fit$1 FillBounds;
        public static final ContentScale$Companion$Fit$1 FillHeight;
        public static final ContentScale$Companion$Fit$1 FillWidth;
        public static final ContentScale$Companion$Fit$1 Fit;
        public static final ContentScale$Companion$Fit$1 Inside;
        public static final FixedScale None = new FixedScale(1.0f);

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.layout.ContentScale$Companion$Fit$1] */
        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.layout.ContentScale$Companion$Fit$1] */
        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.ui.layout.ContentScale$Companion$Fit$1] */
        /* JADX WARN: Type inference failed for: r0v3, types: [androidx.compose.ui.layout.ContentScale$Companion$Fit$1] */
        /* JADX WARN: Type inference failed for: r0v4, types: [androidx.compose.ui.layout.ContentScale$Companion$Fit$1] */
        /* JADX WARN: Type inference failed for: r0v6, types: [androidx.compose.ui.layout.ContentScale$Companion$Fit$1] */
        static {
            final int i = 1;
            Crop = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$Fit$1
                @Override // androidx.compose.ui.layout.ContentScale
                /* renamed from: computeScaleFactor-H7hwNQA */
                public final long mo832computeScaleFactorH7hwNQA(long j, long j2) {
                    float min;
                    float min2;
                    switch (i) {
                        case 0:
                            min = Math.min(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax)) / Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)));
                            long floatToRawIntBits = (Float.floatToRawIntBits(min) << 32) | (Float.floatToRawIntBits(min) & BodyPartID.bodyIdMax);
                            int i2 = ScaleFactor.$r8$clinit;
                            return floatToRawIntBits;
                        case 1:
                            float max = Math.max(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax)) / Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)));
                            long floatToRawIntBits2 = (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max) & BodyPartID.bodyIdMax);
                            int i3 = ScaleFactor.$r8$clinit;
                            return floatToRawIntBits2;
                        case 2:
                            float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32));
                            float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax)) / Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax));
                            long floatToRawIntBits3 = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & BodyPartID.bodyIdMax);
                            int i4 = ScaleFactor.$r8$clinit;
                            return floatToRawIntBits3;
                        case 3:
                            float intBitsToFloat3 = Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax)) / Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax));
                            long floatToRawIntBits4 = (Float.floatToRawIntBits(intBitsToFloat3) << 32) | (Float.floatToRawIntBits(intBitsToFloat3) & BodyPartID.bodyIdMax);
                            int i5 = ScaleFactor.$r8$clinit;
                            return floatToRawIntBits4;
                        case 4:
                            float intBitsToFloat4 = Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32));
                            long floatToRawIntBits5 = (Float.floatToRawIntBits(intBitsToFloat4) << 32) | (Float.floatToRawIntBits(intBitsToFloat4) & BodyPartID.bodyIdMax);
                            int i6 = ScaleFactor.$r8$clinit;
                            return floatToRawIntBits5;
                        default:
                            if (Float.intBitsToFloat((int) (j >> 32)) <= Float.intBitsToFloat((int) (j2 >> 32)) && Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)) <= Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax))) {
                                long floatToRawIntBits6 = (Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & BodyPartID.bodyIdMax);
                                int i7 = ScaleFactor.$r8$clinit;
                                return floatToRawIntBits6;
                            }
                            min2 = Math.min(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax)) / Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)));
                            long floatToRawIntBits7 = (Float.floatToRawIntBits(min2) << 32) | (Float.floatToRawIntBits(min2) & BodyPartID.bodyIdMax);
                            int i8 = ScaleFactor.$r8$clinit;
                            return floatToRawIntBits7;
                    }
                }
            };
            final int i2 = 0;
            Fit = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$Fit$1
                @Override // androidx.compose.ui.layout.ContentScale
                /* renamed from: computeScaleFactor-H7hwNQA */
                public final long mo832computeScaleFactorH7hwNQA(long j, long j2) {
                    float min;
                    float min2;
                    switch (i2) {
                        case 0:
                            min = Math.min(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax)) / Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)));
                            long floatToRawIntBits = (Float.floatToRawIntBits(min) << 32) | (Float.floatToRawIntBits(min) & BodyPartID.bodyIdMax);
                            int i22 = ScaleFactor.$r8$clinit;
                            return floatToRawIntBits;
                        case 1:
                            float max = Math.max(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax)) / Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)));
                            long floatToRawIntBits2 = (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max) & BodyPartID.bodyIdMax);
                            int i3 = ScaleFactor.$r8$clinit;
                            return floatToRawIntBits2;
                        case 2:
                            float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32));
                            float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax)) / Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax));
                            long floatToRawIntBits3 = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & BodyPartID.bodyIdMax);
                            int i4 = ScaleFactor.$r8$clinit;
                            return floatToRawIntBits3;
                        case 3:
                            float intBitsToFloat3 = Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax)) / Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax));
                            long floatToRawIntBits4 = (Float.floatToRawIntBits(intBitsToFloat3) << 32) | (Float.floatToRawIntBits(intBitsToFloat3) & BodyPartID.bodyIdMax);
                            int i5 = ScaleFactor.$r8$clinit;
                            return floatToRawIntBits4;
                        case 4:
                            float intBitsToFloat4 = Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32));
                            long floatToRawIntBits5 = (Float.floatToRawIntBits(intBitsToFloat4) << 32) | (Float.floatToRawIntBits(intBitsToFloat4) & BodyPartID.bodyIdMax);
                            int i6 = ScaleFactor.$r8$clinit;
                            return floatToRawIntBits5;
                        default:
                            if (Float.intBitsToFloat((int) (j >> 32)) <= Float.intBitsToFloat((int) (j2 >> 32)) && Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)) <= Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax))) {
                                long floatToRawIntBits6 = (Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & BodyPartID.bodyIdMax);
                                int i7 = ScaleFactor.$r8$clinit;
                                return floatToRawIntBits6;
                            }
                            min2 = Math.min(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax)) / Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)));
                            long floatToRawIntBits7 = (Float.floatToRawIntBits(min2) << 32) | (Float.floatToRawIntBits(min2) & BodyPartID.bodyIdMax);
                            int i8 = ScaleFactor.$r8$clinit;
                            return floatToRawIntBits7;
                    }
                }
            };
            final int i3 = 3;
            FillHeight = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$Fit$1
                @Override // androidx.compose.ui.layout.ContentScale
                /* renamed from: computeScaleFactor-H7hwNQA */
                public final long mo832computeScaleFactorH7hwNQA(long j, long j2) {
                    float min;
                    float min2;
                    switch (i3) {
                        case 0:
                            min = Math.min(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax)) / Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)));
                            long floatToRawIntBits = (Float.floatToRawIntBits(min) << 32) | (Float.floatToRawIntBits(min) & BodyPartID.bodyIdMax);
                            int i22 = ScaleFactor.$r8$clinit;
                            return floatToRawIntBits;
                        case 1:
                            float max = Math.max(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax)) / Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)));
                            long floatToRawIntBits2 = (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max) & BodyPartID.bodyIdMax);
                            int i32 = ScaleFactor.$r8$clinit;
                            return floatToRawIntBits2;
                        case 2:
                            float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32));
                            float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax)) / Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax));
                            long floatToRawIntBits3 = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & BodyPartID.bodyIdMax);
                            int i4 = ScaleFactor.$r8$clinit;
                            return floatToRawIntBits3;
                        case 3:
                            float intBitsToFloat3 = Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax)) / Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax));
                            long floatToRawIntBits4 = (Float.floatToRawIntBits(intBitsToFloat3) << 32) | (Float.floatToRawIntBits(intBitsToFloat3) & BodyPartID.bodyIdMax);
                            int i5 = ScaleFactor.$r8$clinit;
                            return floatToRawIntBits4;
                        case 4:
                            float intBitsToFloat4 = Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32));
                            long floatToRawIntBits5 = (Float.floatToRawIntBits(intBitsToFloat4) << 32) | (Float.floatToRawIntBits(intBitsToFloat4) & BodyPartID.bodyIdMax);
                            int i6 = ScaleFactor.$r8$clinit;
                            return floatToRawIntBits5;
                        default:
                            if (Float.intBitsToFloat((int) (j >> 32)) <= Float.intBitsToFloat((int) (j2 >> 32)) && Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)) <= Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax))) {
                                long floatToRawIntBits6 = (Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & BodyPartID.bodyIdMax);
                                int i7 = ScaleFactor.$r8$clinit;
                                return floatToRawIntBits6;
                            }
                            min2 = Math.min(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax)) / Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)));
                            long floatToRawIntBits7 = (Float.floatToRawIntBits(min2) << 32) | (Float.floatToRawIntBits(min2) & BodyPartID.bodyIdMax);
                            int i8 = ScaleFactor.$r8$clinit;
                            return floatToRawIntBits7;
                    }
                }
            };
            final int i4 = 4;
            FillWidth = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$Fit$1
                @Override // androidx.compose.ui.layout.ContentScale
                /* renamed from: computeScaleFactor-H7hwNQA */
                public final long mo832computeScaleFactorH7hwNQA(long j, long j2) {
                    float min;
                    float min2;
                    switch (i4) {
                        case 0:
                            min = Math.min(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax)) / Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)));
                            long floatToRawIntBits = (Float.floatToRawIntBits(min) << 32) | (Float.floatToRawIntBits(min) & BodyPartID.bodyIdMax);
                            int i22 = ScaleFactor.$r8$clinit;
                            return floatToRawIntBits;
                        case 1:
                            float max = Math.max(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax)) / Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)));
                            long floatToRawIntBits2 = (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max) & BodyPartID.bodyIdMax);
                            int i32 = ScaleFactor.$r8$clinit;
                            return floatToRawIntBits2;
                        case 2:
                            float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32));
                            float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax)) / Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax));
                            long floatToRawIntBits3 = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & BodyPartID.bodyIdMax);
                            int i42 = ScaleFactor.$r8$clinit;
                            return floatToRawIntBits3;
                        case 3:
                            float intBitsToFloat3 = Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax)) / Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax));
                            long floatToRawIntBits4 = (Float.floatToRawIntBits(intBitsToFloat3) << 32) | (Float.floatToRawIntBits(intBitsToFloat3) & BodyPartID.bodyIdMax);
                            int i5 = ScaleFactor.$r8$clinit;
                            return floatToRawIntBits4;
                        case 4:
                            float intBitsToFloat4 = Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32));
                            long floatToRawIntBits5 = (Float.floatToRawIntBits(intBitsToFloat4) << 32) | (Float.floatToRawIntBits(intBitsToFloat4) & BodyPartID.bodyIdMax);
                            int i6 = ScaleFactor.$r8$clinit;
                            return floatToRawIntBits5;
                        default:
                            if (Float.intBitsToFloat((int) (j >> 32)) <= Float.intBitsToFloat((int) (j2 >> 32)) && Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)) <= Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax))) {
                                long floatToRawIntBits6 = (Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & BodyPartID.bodyIdMax);
                                int i7 = ScaleFactor.$r8$clinit;
                                return floatToRawIntBits6;
                            }
                            min2 = Math.min(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax)) / Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)));
                            long floatToRawIntBits7 = (Float.floatToRawIntBits(min2) << 32) | (Float.floatToRawIntBits(min2) & BodyPartID.bodyIdMax);
                            int i8 = ScaleFactor.$r8$clinit;
                            return floatToRawIntBits7;
                    }
                }
            };
            final int i5 = 5;
            Inside = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$Fit$1
                @Override // androidx.compose.ui.layout.ContentScale
                /* renamed from: computeScaleFactor-H7hwNQA */
                public final long mo832computeScaleFactorH7hwNQA(long j, long j2) {
                    float min;
                    float min2;
                    switch (i5) {
                        case 0:
                            min = Math.min(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax)) / Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)));
                            long floatToRawIntBits = (Float.floatToRawIntBits(min) << 32) | (Float.floatToRawIntBits(min) & BodyPartID.bodyIdMax);
                            int i22 = ScaleFactor.$r8$clinit;
                            return floatToRawIntBits;
                        case 1:
                            float max = Math.max(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax)) / Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)));
                            long floatToRawIntBits2 = (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max) & BodyPartID.bodyIdMax);
                            int i32 = ScaleFactor.$r8$clinit;
                            return floatToRawIntBits2;
                        case 2:
                            float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32));
                            float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax)) / Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax));
                            long floatToRawIntBits3 = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & BodyPartID.bodyIdMax);
                            int i42 = ScaleFactor.$r8$clinit;
                            return floatToRawIntBits3;
                        case 3:
                            float intBitsToFloat3 = Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax)) / Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax));
                            long floatToRawIntBits4 = (Float.floatToRawIntBits(intBitsToFloat3) << 32) | (Float.floatToRawIntBits(intBitsToFloat3) & BodyPartID.bodyIdMax);
                            int i52 = ScaleFactor.$r8$clinit;
                            return floatToRawIntBits4;
                        case 4:
                            float intBitsToFloat4 = Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32));
                            long floatToRawIntBits5 = (Float.floatToRawIntBits(intBitsToFloat4) << 32) | (Float.floatToRawIntBits(intBitsToFloat4) & BodyPartID.bodyIdMax);
                            int i6 = ScaleFactor.$r8$clinit;
                            return floatToRawIntBits5;
                        default:
                            if (Float.intBitsToFloat((int) (j >> 32)) <= Float.intBitsToFloat((int) (j2 >> 32)) && Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)) <= Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax))) {
                                long floatToRawIntBits6 = (Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & BodyPartID.bodyIdMax);
                                int i7 = ScaleFactor.$r8$clinit;
                                return floatToRawIntBits6;
                            }
                            min2 = Math.min(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax)) / Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)));
                            long floatToRawIntBits7 = (Float.floatToRawIntBits(min2) << 32) | (Float.floatToRawIntBits(min2) & BodyPartID.bodyIdMax);
                            int i8 = ScaleFactor.$r8$clinit;
                            return floatToRawIntBits7;
                    }
                }
            };
            final int i6 = 2;
            FillBounds = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$Fit$1
                @Override // androidx.compose.ui.layout.ContentScale
                /* renamed from: computeScaleFactor-H7hwNQA */
                public final long mo832computeScaleFactorH7hwNQA(long j, long j2) {
                    float min;
                    float min2;
                    switch (i6) {
                        case 0:
                            min = Math.min(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax)) / Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)));
                            long floatToRawIntBits = (Float.floatToRawIntBits(min) << 32) | (Float.floatToRawIntBits(min) & BodyPartID.bodyIdMax);
                            int i22 = ScaleFactor.$r8$clinit;
                            return floatToRawIntBits;
                        case 1:
                            float max = Math.max(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax)) / Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)));
                            long floatToRawIntBits2 = (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max) & BodyPartID.bodyIdMax);
                            int i32 = ScaleFactor.$r8$clinit;
                            return floatToRawIntBits2;
                        case 2:
                            float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32));
                            float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax)) / Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax));
                            long floatToRawIntBits3 = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & BodyPartID.bodyIdMax);
                            int i42 = ScaleFactor.$r8$clinit;
                            return floatToRawIntBits3;
                        case 3:
                            float intBitsToFloat3 = Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax)) / Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax));
                            long floatToRawIntBits4 = (Float.floatToRawIntBits(intBitsToFloat3) << 32) | (Float.floatToRawIntBits(intBitsToFloat3) & BodyPartID.bodyIdMax);
                            int i52 = ScaleFactor.$r8$clinit;
                            return floatToRawIntBits4;
                        case 4:
                            float intBitsToFloat4 = Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32));
                            long floatToRawIntBits5 = (Float.floatToRawIntBits(intBitsToFloat4) << 32) | (Float.floatToRawIntBits(intBitsToFloat4) & BodyPartID.bodyIdMax);
                            int i62 = ScaleFactor.$r8$clinit;
                            return floatToRawIntBits5;
                        default:
                            if (Float.intBitsToFloat((int) (j >> 32)) <= Float.intBitsToFloat((int) (j2 >> 32)) && Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)) <= Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax))) {
                                long floatToRawIntBits6 = (Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & BodyPartID.bodyIdMax);
                                int i7 = ScaleFactor.$r8$clinit;
                                return floatToRawIntBits6;
                            }
                            min2 = Math.min(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax)) / Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)));
                            long floatToRawIntBits7 = (Float.floatToRawIntBits(min2) << 32) | (Float.floatToRawIntBits(min2) & BodyPartID.bodyIdMax);
                            int i8 = ScaleFactor.$r8$clinit;
                            return floatToRawIntBits7;
                    }
                }
            };
        }
    }

    /* renamed from: computeScaleFactor-H7hwNQA, reason: not valid java name */
    long mo832computeScaleFactorH7hwNQA(long j, long j2);
}
