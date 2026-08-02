package androidx.media3.muxer;

import androidx.tracing.Trace;
import coil3.size.DimensionKt;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.RegularImmutableList;
import com.squareup.cash.clientroutes.ClientRoute;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class AnnexBUtils {
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0060, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0079, code lost:
    
        if (r8 == 1) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static RegularImmutableList findNalUnits(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() == 0) {
            ImmutableList.Itr itr = ImmutableList.EMPTY_ITR;
            return RegularImmutableList.EMPTY;
        }
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        int skipLeadingZerosAndFindNalStartCodeIndex = skipLeadingZerosAndFindNalStartCodeIndex(asReadOnlyBuffer.position(), asReadOnlyBuffer) + 3;
        DimensionKt.checkNonnegative(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i = 0;
        boolean z = true;
        int i2 = skipLeadingZerosAndFindNalStartCodeIndex;
        while (skipLeadingZerosAndFindNalStartCodeIndex < asReadOnlyBuffer.limit()) {
            if (!z) {
                int skipLeadingZerosAndFindNalStartCodeIndex2 = skipLeadingZerosAndFindNalStartCodeIndex(skipLeadingZerosAndFindNalStartCodeIndex, asReadOnlyBuffer);
                if (skipLeadingZerosAndFindNalStartCodeIndex2 == asReadOnlyBuffer.limit()) {
                    break;
                }
                i2 = skipLeadingZerosAndFindNalStartCodeIndex2 + 3;
                skipLeadingZerosAndFindNalStartCodeIndex = i2;
                z = true;
            } else {
                while (true) {
                    if (skipLeadingZerosAndFindNalStartCodeIndex <= asReadOnlyBuffer.limit() - 4) {
                        int i3 = asReadOnlyBuffer.getInt(skipLeadingZerosAndFindNalStartCodeIndex);
                        int i4 = i3 & (-256);
                        if (i4 == 0 || i4 == 256) {
                            break;
                        }
                        int i5 = 16777215 & i3;
                        if (i5 == 0 || i5 == 1) {
                            break;
                        }
                        skipLeadingZerosAndFindNalStartCodeIndex = (65535 & i3) == 0 ? skipLeadingZerosAndFindNalStartCodeIndex + 2 : (i3 & 255) == 0 ? skipLeadingZerosAndFindNalStartCodeIndex + 3 : skipLeadingZerosAndFindNalStartCodeIndex + 4;
                    } else {
                        if (skipLeadingZerosAndFindNalStartCodeIndex == asReadOnlyBuffer.limit() - 3) {
                            short s = asReadOnlyBuffer.getShort(skipLeadingZerosAndFindNalStartCodeIndex);
                            byte b = asReadOnlyBuffer.get(skipLeadingZerosAndFindNalStartCodeIndex + 2);
                            if (s == 0) {
                                if (b != 0) {
                                }
                            }
                        }
                        skipLeadingZerosAndFindNalStartCodeIndex = asReadOnlyBuffer.limit();
                    }
                }
                ByteBuffer duplicate = asReadOnlyBuffer.duplicate();
                duplicate.position(i2);
                duplicate.limit((skipLeadingZerosAndFindNalStartCodeIndex - i2) + i2);
                ByteBuffer slice = duplicate.slice();
                slice.getClass();
                int i6 = i + 1;
                int expandedCapacity = ImmutableCollection.ArrayBasedBuilder.expandedCapacity(objArr.length, i6);
                if (expandedCapacity > objArr.length) {
                    objArr = Arrays.copyOf(objArr, expandedCapacity);
                }
                objArr[i] = slice;
                z = false;
                i = i6;
            }
        }
        return ImmutableList.asImmutableList(i, objArr);
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewAfterpayInAppBrowserV2.deepLinkSpecs;
    }

    public static int skipLeadingZerosAndFindNalStartCodeIndex(int i, ByteBuffer byteBuffer) {
        while (true) {
            if (i > byteBuffer.limit() - 4) {
                if (i <= byteBuffer.limit() - 3) {
                    Trace.checkState("Invalid NAL units", byteBuffer.getShort(i) == 0);
                    byte b = byteBuffer.get(i + 2);
                    if (b != 1) {
                        Trace.checkState("Invalid NAL units", b == 0);
                    }
                } else {
                    while (i < byteBuffer.limit()) {
                        Trace.checkState("Invalid NAL units", byteBuffer.get(i) == 0);
                        i++;
                    }
                }
                return byteBuffer.limit();
            }
            int i2 = byteBuffer.getInt(i);
            int i3 = i2 & (-256);
            if (i3 == 256) {
                break;
            }
            Trace.checkState("Invalid Nal units", i3 == 0);
            int i4 = i2 & 255;
            if (i4 == 1) {
                return i + 1;
            }
            if (i4 == 0) {
                r1 = true;
            }
            Trace.checkState("Invalid Nal units", r1);
            i++;
        }
        return i;
    }
}
