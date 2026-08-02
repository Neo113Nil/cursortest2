package com.google.zxing.qrcode;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.recyclerview.widget.RecyclerView;
import com.android.volley.Response;
import com.google.mlkit.vision.common.zzb;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.PerspectiveTransform;
import com.google.zxing.qrcode.decoder.Version;
import com.google.zxing.qrcode.detector.AlignmentPattern;
import com.google.zxing.qrcode.detector.FinderPattern;
import com.google.zxing.qrcode.detector.FinderPatternFinder;
import com.nimbusds.jose.jca.JCAContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class QRCodeReader {
    public final zzb decoder = new zzb(11);

    /* JADX WARN: Removed duplicated region for block: B:105:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01f2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0580 A[Catch: ChecksumException | FormatException -> 0x0618, TryCatch #0 {ChecksumException | FormatException -> 0x0618, blocks: (B:287:0x0566, B:288:0x057c, B:290:0x0580, B:291:0x0583, B:293:0x0587, B:295:0x0591, B:297:0x0597, B:302:0x059c), top: B:286:0x0566 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Result decode(BinaryBitmap binaryBitmap) {
        int i;
        ArrayList arrayList;
        FinderPattern finderPattern;
        FinderPattern finderPattern2;
        FinderPattern finderPattern3;
        char c;
        int i2;
        float f;
        float f2;
        AlignmentPattern alignmentPattern;
        float f3;
        float f4;
        float f5;
        ResultPoint[] resultPointArr;
        ChecksumException checksumException;
        BitMatrix bitMatrix;
        int i3;
        DecoderResult decoderResult;
        int i4;
        int i5;
        Result result;
        List list;
        String str;
        int i6;
        boolean z;
        double d;
        double abs;
        int i7;
        int abs2;
        BitMatrix blackMatrix = binaryBitmap.getBlackMatrix();
        JCAContext jCAContext = new JCAContext(blackMatrix, 11);
        FinderPatternFinder finderPatternFinder = new FinderPatternFinder(blackMatrix);
        int i8 = blackMatrix.height;
        int i9 = blackMatrix.width;
        int i10 = (i8 * 3) / 388;
        int i11 = 3;
        if (i10 < 3) {
            i10 = 3;
        }
        char c2 = 5;
        int[] iArr = new int[5];
        int i12 = i10 - 1;
        int i13 = 0;
        boolean z2 = false;
        while (true) {
            i = 1;
            char c3 = c2;
            int i14 = 4;
            arrayList = finderPatternFinder.possibleCenters;
            if (i12 >= i8 || z2) {
                break;
            }
            Arrays.fill(iArr, i13);
            int i15 = i11;
            int i16 = i13;
            int i17 = i16;
            while (i17 < i9) {
                if (blackMatrix.get(i17, i12)) {
                    if ((i16 & 1) == 1) {
                        i16++;
                    }
                    iArr[i16] = iArr[i16] + 1;
                    i7 = i14;
                } else if ((i16 & 1) != 0) {
                    i7 = i14;
                    iArr[i16] = iArr[i16] + 1;
                } else if (i16 == i14) {
                    if (!FinderPatternFinder.foundPatternCross(iArr)) {
                        i7 = i14;
                        iArr[0] = iArr[2];
                        iArr[1] = iArr[i15];
                        iArr[2] = iArr[i7];
                        iArr[i15] = 1;
                        iArr[i7] = 0;
                    } else if (finderPatternFinder.handlePossibleCenter(i12, i17, iArr)) {
                        if (finderPatternFinder.hasSkipped) {
                            z2 = finderPatternFinder.haveMultiplyConfirmedCenters();
                            i7 = i14;
                        } else {
                            if (arrayList.size() > 1) {
                                Iterator it = arrayList.iterator();
                                FinderPattern finderPattern4 = null;
                                while (it.hasNext()) {
                                    FinderPattern finderPattern5 = (FinderPattern) it.next();
                                    i7 = i14;
                                    if (finderPattern5.count >= 2) {
                                        if (finderPattern4 != null) {
                                            finderPatternFinder.hasSkipped = true;
                                            abs2 = ((int) (Math.abs(finderPattern4.x - finderPattern5.x) - Math.abs(finderPattern4.y - finderPattern5.y))) / 2;
                                            break;
                                        }
                                        finderPattern4 = finderPattern5;
                                    }
                                    i14 = i7;
                                }
                            }
                            i7 = i14;
                            abs2 = 0;
                            int i18 = iArr[2];
                            if (abs2 > i18) {
                                i12 += (abs2 - i18) - 2;
                                i17 = i9 - 1;
                            }
                        }
                        i16 = 0;
                        Arrays.fill(iArr, 0);
                        i10 = 2;
                    } else {
                        i7 = i14;
                        iArr[0] = iArr[2];
                        iArr[1] = iArr[i15];
                        iArr[2] = iArr[i7];
                        iArr[i15] = 1;
                        iArr[i7] = 0;
                    }
                    i16 = i15;
                } else {
                    i7 = i14;
                    i16++;
                    iArr[i16] = iArr[i16] + 1;
                }
                i17++;
                i14 = i7;
            }
            if (FinderPatternFinder.foundPatternCross(iArr) && finderPatternFinder.handlePossibleCenter(i12, i9, iArr)) {
                int i19 = iArr[0];
                if (finderPatternFinder.hasSkipped) {
                    z2 = finderPatternFinder.haveMultiplyConfirmedCenters();
                }
                i10 = i19;
            }
            i12 += i10;
            c2 = c3;
            i11 = i15;
            i13 = 0;
        }
        if (arrayList.size() < i11) {
            throw NotFoundException.getNotFoundInstance();
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (((FinderPattern) it2.next()).count < 2) {
                it2.remove();
            }
        }
        Collections.sort(arrayList, FinderPatternFinder.moduleComparator);
        FinderPattern[] finderPatternArr = new FinderPattern[3];
        int i20 = 0;
        double d2 = Double.MAX_VALUE;
        while (i20 < arrayList.size() - 2) {
            FinderPattern finderPattern6 = (FinderPattern) arrayList.get(i20);
            float f6 = finderPattern6.estimatedModuleSize;
            i20++;
            int i21 = i20;
            while (i21 < arrayList.size() - i) {
                FinderPattern finderPattern7 = (FinderPattern) arrayList.get(i21);
                double squaredDistance = FinderPatternFinder.squaredDistance(finderPattern6, finderPattern7);
                i21++;
                int i22 = i21;
                while (i22 < arrayList.size()) {
                    FinderPattern finderPattern8 = (FinderPattern) arrayList.get(i22);
                    int i23 = i;
                    if (finderPattern8.estimatedModuleSize <= 1.4f * f6) {
                        double squaredDistance2 = FinderPatternFinder.squaredDistance(finderPattern7, finderPattern8);
                        double squaredDistance3 = FinderPatternFinder.squaredDistance(finderPattern6, finderPattern8);
                        if (squaredDistance < squaredDistance2) {
                            if (squaredDistance2 <= squaredDistance3) {
                                squaredDistance3 = squaredDistance2;
                                squaredDistance2 = squaredDistance3;
                            } else if (squaredDistance >= squaredDistance3) {
                                d = squaredDistance3;
                                squaredDistance3 = squaredDistance;
                                abs = Math.abs(squaredDistance2 - (d * 2.0d)) + Math.abs(squaredDistance2 - (squaredDistance3 * 2.0d));
                                if (abs >= d2) {
                                    finderPatternArr[0] = finderPattern6;
                                    finderPatternArr[i23] = finderPattern7;
                                    finderPatternArr[2] = finderPattern8;
                                    d2 = abs;
                                }
                            }
                            d = squaredDistance;
                            abs = Math.abs(squaredDistance2 - (d * 2.0d)) + Math.abs(squaredDistance2 - (squaredDistance3 * 2.0d));
                            if (abs >= d2) {
                            }
                        } else {
                            if (squaredDistance2 >= squaredDistance3) {
                                d = squaredDistance3;
                                squaredDistance3 = squaredDistance2;
                            } else if (squaredDistance < squaredDistance3) {
                                d = squaredDistance2;
                                squaredDistance2 = squaredDistance3;
                                squaredDistance3 = squaredDistance;
                                abs = Math.abs(squaredDistance2 - (d * 2.0d)) + Math.abs(squaredDistance2 - (squaredDistance3 * 2.0d));
                                if (abs >= d2) {
                                }
                            } else {
                                d = squaredDistance2;
                            }
                            squaredDistance2 = squaredDistance;
                            abs = Math.abs(squaredDistance2 - (d * 2.0d)) + Math.abs(squaredDistance2 - (squaredDistance3 * 2.0d));
                            if (abs >= d2) {
                            }
                        }
                    }
                    i22++;
                    i = i23;
                }
            }
        }
        int i24 = i;
        if (d2 == Double.MAX_VALUE) {
            throw NotFoundException.getNotFoundInstance();
        }
        float distance = ResultPoint.distance(finderPatternArr[0], finderPatternArr[i24]);
        float distance2 = ResultPoint.distance(finderPatternArr[i24], finderPatternArr[2]);
        float distance3 = ResultPoint.distance(finderPatternArr[0], finderPatternArr[2]);
        if (distance2 >= distance && distance2 >= distance3) {
            finderPattern = finderPatternArr[0];
            finderPattern2 = finderPatternArr[i24];
            finderPattern3 = finderPatternArr[2];
        } else if (distance3 < distance2 || distance3 < distance) {
            finderPattern = finderPatternArr[2];
            finderPattern2 = finderPatternArr[0];
            finderPattern3 = finderPatternArr[i24];
        } else {
            finderPattern = finderPatternArr[i24];
            finderPattern2 = finderPatternArr[0];
            finderPattern3 = finderPatternArr[2];
        }
        float f7 = finderPattern.x;
        float f8 = finderPattern.y;
        if (((finderPattern2.y - f8) * (finderPattern3.x - f7)) - ((finderPattern2.x - f7) * (finderPattern3.y - f8)) < RecyclerView.DECELERATION_RATE) {
            FinderPattern finderPattern9 = finderPattern3;
            finderPattern3 = finderPattern2;
            finderPattern2 = finderPattern9;
        }
        finderPatternArr[0] = finderPattern2;
        finderPatternArr[i24] = finderPattern;
        finderPatternArr[2] = finderPattern3;
        float calculateModuleSizeOneWay = jCAContext.calculateModuleSizeOneWay(finderPattern, finderPattern3);
        float f9 = finderPattern.x;
        float f10 = finderPattern3.y;
        float f11 = finderPattern3.x;
        float calculateModuleSizeOneWay2 = jCAContext.calculateModuleSizeOneWay(finderPattern, finderPattern2);
        float f12 = finderPattern2.y;
        float f13 = finderPattern2.x;
        float f14 = (calculateModuleSizeOneWay2 + calculateModuleSizeOneWay) / 2.0f;
        if (f14 < 1.0f) {
            throw NotFoundException.getNotFoundInstance();
        }
        float distance4 = ResultPoint.distance(finderPattern, finderPattern3) / f14;
        int i25 = (int) (distance4 + (distance4 < RecyclerView.DECELERATION_RATE ? -0.5f : 0.5f));
        float distance5 = ResultPoint.distance(finderPattern, finderPattern2) / f14;
        int i26 = (((int) (distance5 + (distance5 >= RecyclerView.DECELERATION_RATE ? 0.5f : -0.5f))) + i25) / 2;
        int i27 = i26 + 7;
        int i28 = i27 & 3;
        if (i28 == 0) {
            c = 2;
            i2 = i26 + 8;
        } else if (i28 != 2) {
            c = 2;
            i2 = i28 != 3 ? i27 : i26 + 5;
        } else {
            c = 2;
            i2 = i26 + 6;
        }
        int[] iArr2 = Version.VERSION_DECODE_INFO;
        if (i2 % 4 != i24) {
            throw FormatException.getFormatInstance();
        }
        try {
            Version versionForNumber = Version.getVersionForNumber((i2 - 17) / 4);
            int i29 = (versionForNumber.versionNumber * 4) + 10;
            if (versionForNumber.alignmentPatternCenters.length > 0) {
                f2 = f10;
                float f15 = 1.0f - (3.0f / i29);
                int m = (int) CameraState$Type$EnumUnboxingLocalUtility.m((f11 - f9) + f13, f9, f15, f9);
                int m2 = (int) CameraState$Type$EnumUnboxingLocalUtility.m((f10 - f8) + f12, f8, f15, f8);
                f = f8;
                for (int i30 = 4; i30 <= 16; i30 <<= 1) {
                    try {
                        alignmentPattern = jCAContext.findAlignmentInRegion(f14, i30, m, m2);
                        break;
                    } catch (NotFoundException unused) {
                    }
                }
            } else {
                f = f8;
                f2 = f10;
            }
            alignmentPattern = null;
            float f16 = i2 - 3.5f;
            if (alignmentPattern != null) {
                f3 = alignmentPattern.x;
                f4 = alignmentPattern.y;
                f5 = f16 - 3.0f;
            } else {
                f3 = (f11 - f9) + f13;
                f4 = (f2 - f) + f12;
                f5 = f16;
            }
            float f17 = f4;
            float f18 = finderPattern.x;
            float f19 = finderPattern.y;
            float f20 = finderPattern3.x;
            float f21 = finderPattern3.y;
            float f22 = finderPattern2.x;
            float f23 = finderPattern2.y;
            PerspectiveTransform squareToQuadrilateral = PerspectiveTransform.squareToQuadrilateral(3.5f, 3.5f, f16, 3.5f, f5, f5, 3.5f, f16);
            float f24 = squareToQuadrilateral.a22;
            AlignmentPattern alignmentPattern2 = alignmentPattern;
            float f25 = squareToQuadrilateral.a33;
            float f26 = f24 * f25;
            float f27 = squareToQuadrilateral.a23;
            float f28 = squareToQuadrilateral.a32;
            float f29 = f26 - (f27 * f28);
            float f30 = squareToQuadrilateral.a31;
            float f31 = f27 * f30;
            float f32 = squareToQuadrilateral.a21;
            float f33 = f31 - (f32 * f25);
            float f34 = (f32 * f28) - (f24 * f30);
            float f35 = squareToQuadrilateral.a13;
            float f36 = f35 * f28;
            float f37 = squareToQuadrilateral.a12;
            float f38 = f36 - (f37 * f25);
            float f39 = squareToQuadrilateral.a11;
            float f40 = (f25 * f39) - (f35 * f30);
            float f41 = (f30 * f37) - (f28 * f39);
            float f42 = (f37 * f27) - (f35 * f24);
            float f43 = (f35 * f32) - (f27 * f39);
            float f44 = (f39 * f24) - (f37 * f32);
            PerspectiveTransform squareToQuadrilateral2 = PerspectiveTransform.squareToQuadrilateral(f18, f19, f20, f21, f3, f17, f22, f23);
            float f45 = squareToQuadrilateral2.a11;
            float f46 = squareToQuadrilateral2.a21;
            float f47 = squareToQuadrilateral2.a31;
            float f48 = (f47 * f42) + (f46 * f38) + (f45 * f29);
            float f49 = (f47 * f43) + (f46 * f40) + (f45 * f33);
            float f50 = (f47 * f44) + (f46 * f41) + (f45 * f34);
            float f51 = squareToQuadrilateral2.a12;
            float f52 = squareToQuadrilateral2.a22;
            float f53 = squareToQuadrilateral2.a32;
            float f54 = (f53 * f42) + (f52 * f38) + (f51 * f29);
            float f55 = (f53 * f43) + (f52 * f40) + (f51 * f33);
            float f56 = (f53 * f44) + (f52 * f41) + (f51 * f34);
            float f57 = squareToQuadrilateral2.a13;
            float f58 = squareToQuadrilateral2.a23;
            float f59 = squareToQuadrilateral2.a33;
            float f60 = (f42 * f59) + (f38 * f58) + (f29 * f57);
            float f61 = (f43 * f59) + (f40 * f58) + (f33 * f57);
            float f62 = (f59 * f44) + (f58 * f41) + (f57 * f34);
            if (i2 <= 0 || i2 <= 0) {
                throw NotFoundException.getNotFoundInstance();
            }
            BitMatrix bitMatrix2 = new BitMatrix(i2, i2);
            int i31 = i2 * 2;
            float[] fArr = new float[i31];
            int i32 = 0;
            while (i32 < i2) {
                FinderPattern finderPattern10 = finderPattern;
                float f63 = i32 + 0.5f;
                int i33 = 0;
                while (i33 < i31) {
                    int i34 = i33;
                    fArr[i34] = (i34 / 2) + 0.5f;
                    fArr[i34 + 1] = f63;
                    i33 = i34 + 2;
                }
                int i35 = i31 - 1;
                int i36 = i2;
                for (int i37 = 0; i37 < i35; i37 += 2) {
                    float f64 = fArr[i37];
                    int i38 = i37 + 1;
                    float f65 = fArr[i38];
                    float f66 = (f61 * f65) + (f60 * f64) + f62;
                    fArr[i37] = (((f49 * f65) + (f48 * f64)) + f50) / f66;
                    fArr[i38] = (((f65 * f55) + (f64 * f54)) + f56) / f66;
                }
                int i39 = blackMatrix.height;
                FinderPattern finderPattern11 = finderPattern2;
                FinderPattern finderPattern12 = finderPattern3;
                int i40 = 0;
                boolean z3 = true;
                while (i40 < i35 && z3) {
                    int i41 = (int) fArr[i40];
                    int i42 = i40 + 1;
                    int i43 = i35;
                    int i44 = (int) fArr[i42];
                    int i45 = i40;
                    if (i41 < -1 || i41 > i9 || i44 < -1 || i44 > i39) {
                        throw NotFoundException.getNotFoundInstance();
                    }
                    if (i41 == -1) {
                        fArr[i45] = 0.0f;
                    } else if (i41 == i9) {
                        fArr[i45] = i9 - 1;
                    } else {
                        z = false;
                        if (i44 != -1) {
                            fArr[i42] = 0.0f;
                        } else if (i44 == i39) {
                            fArr[i42] = i39 - 1;
                        } else {
                            z3 = z;
                            i40 = i45 + 2;
                            i35 = i43;
                        }
                        z3 = true;
                        i40 = i45 + 2;
                        i35 = i43;
                    }
                    z = true;
                    if (i44 != -1) {
                    }
                    z3 = true;
                    i40 = i45 + 2;
                    i35 = i43;
                }
                int i46 = i31 - 2;
                boolean z4 = true;
                while (i46 >= 0 && z4) {
                    int i47 = (int) fArr[i46];
                    int i48 = i46 + 1;
                    int i49 = i46;
                    int i50 = (int) fArr[i48];
                    if (i47 < -1 || i47 > i9 || i50 < -1 || i50 > i39) {
                        throw NotFoundException.getNotFoundInstance();
                    }
                    if (i47 == -1) {
                        fArr[i49] = 0.0f;
                    } else if (i47 == i9) {
                        fArr[i49] = i9 - 1;
                    } else {
                        z4 = false;
                        if (i50 != -1) {
                            fArr[i48] = 0.0f;
                        } else if (i50 == i39) {
                            fArr[i48] = i39 - 1;
                        } else {
                            i46 = i49 - 2;
                        }
                        z4 = true;
                        i46 = i49 - 2;
                    }
                    z4 = true;
                    if (i50 != -1) {
                    }
                    z4 = true;
                    i46 = i49 - 2;
                }
                for (int i51 = 0; i51 < i31; i51 += 2) {
                    try {
                        if (blackMatrix.get((int) fArr[i51], (int) fArr[i51 + 1])) {
                            bitMatrix2.set(i51 / 2, i32);
                        }
                    } catch (ArrayIndexOutOfBoundsException unused2) {
                        throw NotFoundException.getNotFoundInstance();
                    }
                }
                i32++;
                finderPattern = finderPattern10;
                i2 = i36;
                finderPattern2 = finderPattern11;
                finderPattern3 = finderPattern12;
            }
            FinderPattern finderPattern13 = finderPattern;
            FinderPattern finderPattern14 = finderPattern2;
            FinderPattern finderPattern15 = finderPattern3;
            if (alignmentPattern2 == null) {
                resultPointArr = new ResultPoint[3];
                resultPointArr[0] = finderPattern14;
                resultPointArr[1] = finderPattern13;
                resultPointArr[c] = finderPattern15;
            } else {
                resultPointArr = new ResultPoint[4];
                resultPointArr[0] = finderPattern14;
                resultPointArr[1] = finderPattern13;
                resultPointArr[c] = finderPattern15;
                resultPointArr[3] = alignmentPattern2;
            }
            ResultPoint[] resultPointArr2 = resultPointArr;
            zzb zzbVar = this.decoder;
            zzbVar.getClass();
            Response response = new Response(bitMatrix2);
            try {
                decoderResult = zzbVar.decode(response);
            } catch (ChecksumException e) {
                checksumException = e;
                e = null;
                try {
                    response.remask();
                    response.cacheEntry = null;
                    response.error = null;
                    response.intermediate = true;
                    response.readVersion();
                    response.readFormatInformation();
                    bitMatrix = (BitMatrix) response.result;
                    i3 = 0;
                    while (i3 < bitMatrix.width) {
                        int i52 = i3 + 1;
                        for (int i53 = i52; i53 < bitMatrix.height; i53++) {
                            if (bitMatrix.get(i3, i53) != bitMatrix.get(i53, i3)) {
                                bitMatrix.flip(i53, i3);
                                bitMatrix.flip(i3, i53);
                            }
                        }
                        i3 = i52;
                    }
                    DecoderResult decode = zzbVar.decode(response);
                    decode.other = new com.google.mlkit.vision.text.zzb(11);
                    decoderResult = decode;
                    i4 = decoderResult.structuredAppendParity;
                    if (((com.google.mlkit.vision.text.zzb) decoderResult.other) != null) {
                    }
                    i5 = 0;
                    result = new Result((String) decoderResult.text, i5);
                    list = (List) decoderResult.byteSegments;
                    if (list != null) {
                    }
                    str = (String) decoderResult.ecLevel;
                    if (str != null) {
                    }
                    if (i4 >= 0) {
                        result.putMetadata(ResultMetadataType.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(i6));
                        result.putMetadata(ResultMetadataType.STRUCTURED_APPEND_PARITY, Integer.valueOf(i4));
                    }
                    result.putMetadata(ResultMetadataType.ERRORS_CORRECTED, (Integer) decoderResult.errorsCorrected);
                    result.putMetadata(ResultMetadataType.SYMBOLOGY_IDENTIFIER, "]Q" + decoderResult.symbologyModifier);
                    return result;
                } catch (ChecksumException | FormatException unused3) {
                    if (e != null) {
                        throw e;
                    }
                    throw checksumException;
                }
            } catch (FormatException e2) {
                e = e2;
                checksumException = null;
                response.remask();
                response.cacheEntry = null;
                response.error = null;
                response.intermediate = true;
                response.readVersion();
                response.readFormatInformation();
                bitMatrix = (BitMatrix) response.result;
                i3 = 0;
                while (i3 < bitMatrix.width) {
                }
                DecoderResult decode2 = zzbVar.decode(response);
                decode2.other = new com.google.mlkit.vision.text.zzb(11);
                decoderResult = decode2;
                i4 = decoderResult.structuredAppendParity;
                if (((com.google.mlkit.vision.text.zzb) decoderResult.other) != null) {
                }
                i5 = 0;
                result = new Result((String) decoderResult.text, i5);
                list = (List) decoderResult.byteSegments;
                if (list != null) {
                }
                str = (String) decoderResult.ecLevel;
                if (str != null) {
                }
                if (i4 >= 0) {
                }
                result.putMetadata(ResultMetadataType.ERRORS_CORRECTED, (Integer) decoderResult.errorsCorrected);
                result.putMetadata(ResultMetadataType.SYMBOLOGY_IDENTIFIER, "]Q" + decoderResult.symbologyModifier);
                return result;
            }
            i4 = decoderResult.structuredAppendParity;
            if (((com.google.mlkit.vision.text.zzb) decoderResult.other) != null || resultPointArr2.length < 3) {
                i5 = 0;
            } else {
                i5 = 0;
                ResultPoint resultPoint = resultPointArr2[0];
                resultPointArr2[0] = resultPointArr2[c];
                resultPointArr2[c] = resultPoint;
            }
            result = new Result((String) decoderResult.text, i5);
            list = (List) decoderResult.byteSegments;
            if (list != null) {
                result.putMetadata(ResultMetadataType.BYTE_SEGMENTS, list);
            }
            str = (String) decoderResult.ecLevel;
            if (str != null) {
                result.putMetadata(ResultMetadataType.ERROR_CORRECTION_LEVEL, str);
            }
            if (i4 >= 0 && (i6 = decoderResult.structuredAppendSequenceNumber) >= 0) {
                result.putMetadata(ResultMetadataType.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(i6));
                result.putMetadata(ResultMetadataType.STRUCTURED_APPEND_PARITY, Integer.valueOf(i4));
            }
            result.putMetadata(ResultMetadataType.ERRORS_CORRECTED, (Integer) decoderResult.errorsCorrected);
            result.putMetadata(ResultMetadataType.SYMBOLOGY_IDENTIFIER, "]Q" + decoderResult.symbologyModifier);
            return result;
        } catch (IllegalArgumentException unused4) {
            throw FormatException.getFormatInstance();
        }
    }
}
