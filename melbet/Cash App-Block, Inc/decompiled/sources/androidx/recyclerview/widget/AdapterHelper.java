package androidx.recyclerview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Looper;
import android.view.ContextThemeWrapper;
import android.widget.TextView;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.core.util.Pools$SimplePool;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.SystemClock;
import androidx.media3.common.util.SystemHandlerWrapper;
import androidx.media3.common.util.Util;
import androidx.media3.container.ReorderingBufferQueue$BuffersWithTimestamp;
import androidx.media3.exoplayer.ExoPlayerImpl;
import androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda19;
import androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda25;
import androidx.media3.exoplayer.ExoPlayerImplInternal$$ExternalSyntheticLambda2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.TransactorKt;
import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.cloudmessaging.zzv;
import com.google.android.material.R$styleable;
import com.google.android.material.shape.AbsoluteCornerSize;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.shared.ContextUtilsKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonDecodingException;
import kotlinx.serialization.json.internal.CharMappings;
import kotlinx.serialization.json.internal.WriteModeKt;

/* loaded from: classes3.dex */
public class AdapterHelper {
    public final /* synthetic */ int $r8$classId;
    public Object mCallback;
    public int mExistingUpdateTypes;
    public Object mOpReorderer;
    public final Object mPendingUpdates;
    public Object mPostponedList;
    public final Object mUpdateOpPool;

    public final class UpdateOp {
        public int cmd;
        public int itemCount;
        public Object payload;
        public int positionStart;

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (!(obj instanceof UpdateOp)) {
                    return false;
                }
                UpdateOp updateOp = (UpdateOp) obj;
                int i = this.cmd;
                if (i != updateOp.cmd) {
                    return false;
                }
                if (i != 8 || Math.abs(this.itemCount - this.positionStart) != 1 || this.itemCount != updateOp.positionStart || this.positionStart != updateOp.itemCount) {
                    if (this.itemCount != updateOp.itemCount || this.positionStart != updateOp.positionStart) {
                        return false;
                    }
                    Object obj2 = this.payload;
                    Object obj3 = updateOp.payload;
                    if (obj2 != null) {
                        if (!obj2.equals(obj3)) {
                            return false;
                        }
                    } else if (obj3 != null) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            return (((this.cmd * 31) + this.positionStart) * 31) + this.itemCount;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("[");
            int i = this.cmd;
            sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
            sb.append(",s:");
            sb.append(this.positionStart);
            sb.append("c:");
            sb.append(this.itemCount);
            sb.append(",p:");
            return Recorder$$ExternalSyntheticOutline1.m(sb, this.payload, "]");
        }
    }

    public AdapterHelper(RecyclerView.AnonymousClass7 anonymousClass7) {
        this.$r8$classId = 0;
        this.mUpdateOpPool = new Pools$SimplePool(30);
        this.mPendingUpdates = new ArrayList();
        this.mPostponedList = new ArrayList();
        this.mExistingUpdateTypes = 0;
        this.mCallback = anonymousClass7;
        this.mOpReorderer = new OpReorderer(this);
    }

    public static AdapterHelper create(Context context, int i) {
        TransactorKt.checkArgument("Cannot create a CalendarItemStyle with a styleResId of 0", i != 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, R$styleable.MaterialCalendarItem);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList colorStateList = ContextUtilsKt.getColorStateList(context, obtainStyledAttributes, 4);
        ColorStateList colorStateList2 = ContextUtilsKt.getColorStateList(context, obtainStyledAttributes, 9);
        ColorStateList colorStateList3 = ContextUtilsKt.getColorStateList(context, obtainStyledAttributes, 7);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        int resourceId = obtainStyledAttributes.getResourceId(5, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(6, 0);
        AbsoluteCornerSize absoluteCornerSize = new AbsoluteCornerSize(RecyclerView.DECELERATION_RATE);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, resourceId);
        if (resourceId2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(resourceId2, true);
        }
        ShapeAppearanceModel build = ShapeAppearanceModel.builder(contextThemeWrapper.obtainStyledAttributes(R$styleable.ShapeAppearance), absoluteCornerSize).build();
        obtainStyledAttributes.recycle();
        return new AdapterHelper(colorStateList, colorStateList2, colorStateList3, dimensionPixelSize, build, rect);
    }

    public static /* synthetic */ void fail$default(AdapterHelper adapterHelper, String str, int i, String str2, int i2) {
        if ((i2 & 2) != 0) {
            i = adapterHelper.mExistingUpdateTypes;
        }
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        adapterHelper.fail(i, str, str2);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if (r10 < r3.presentationTimeUs) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void add(long j, ParsableByteArray parsableByteArray) {
        int i;
        ArrayDeque arrayDeque = (ArrayDeque) this.mPostponedList;
        PriorityQueue priorityQueue = (PriorityQueue) this.mCallback;
        if (j != -9223372036854775807L && (i = this.mExistingUpdateTypes) != 0) {
            if (i != -1 && priorityQueue.size() >= this.mExistingUpdateTypes) {
                ReorderingBufferQueue$BuffersWithTimestamp reorderingBufferQueue$BuffersWithTimestamp = (ReorderingBufferQueue$BuffersWithTimestamp) priorityQueue.peek();
                String str = Util.DEVICE_DEBUG_INFO;
            }
            ArrayDeque arrayDeque2 = (ArrayDeque) this.mPendingUpdates;
            ParsableByteArray parsableByteArray2 = arrayDeque2.isEmpty() ? new ParsableByteArray() : (ParsableByteArray) arrayDeque2.pop();
            parsableByteArray2.reset(parsableByteArray.bytesLeft());
            System.arraycopy(parsableByteArray.data, parsableByteArray.position, parsableByteArray2.data, 0, parsableByteArray2.bytesLeft());
            ReorderingBufferQueue$BuffersWithTimestamp reorderingBufferQueue$BuffersWithTimestamp2 = (ReorderingBufferQueue$BuffersWithTimestamp) this.mOpReorderer;
            if (reorderingBufferQueue$BuffersWithTimestamp2 != null && j == reorderingBufferQueue$BuffersWithTimestamp2.presentationTimeUs) {
                reorderingBufferQueue$BuffersWithTimestamp2.nalBuffers.add(parsableByteArray2);
                return;
            }
            ReorderingBufferQueue$BuffersWithTimestamp reorderingBufferQueue$BuffersWithTimestamp3 = arrayDeque.isEmpty() ? new ReorderingBufferQueue$BuffersWithTimestamp() : (ReorderingBufferQueue$BuffersWithTimestamp) arrayDeque.pop();
            ArrayList arrayList = reorderingBufferQueue$BuffersWithTimestamp3.nalBuffers;
            Trace.checkArgument(j != -9223372036854775807L);
            Trace.checkState(arrayList.isEmpty());
            reorderingBufferQueue$BuffersWithTimestamp3.presentationTimeUs = j;
            arrayList.add(parsableByteArray2);
            priorityQueue.add(reorderingBufferQueue$BuffersWithTimestamp3);
            this.mOpReorderer = reorderingBufferQueue$BuffersWithTimestamp3;
            int i2 = this.mExistingUpdateTypes;
            if (i2 != -1) {
                flushQueueDownToSize(i2);
                return;
            }
            return;
        }
        ((ExoPlayerImplInternal$$ExternalSyntheticLambda2) this.mUpdateOpPool).consume(j, parsableByteArray);
    }

    public int appendHex(int i, CharSequence charSequence) {
        int i2 = i + 4;
        if (i2 < charSequence.length()) {
            ((StringBuilder) this.mCallback).append((char) (fromHexChar(i + 3, charSequence) + (fromHexChar(i, charSequence) << 12) + (fromHexChar(i + 1, charSequence) << 8) + (fromHexChar(i + 2, charSequence) << 4)));
            return i2;
        }
        this.mExistingUpdateTypes = i;
        if (i2 < charSequence.length()) {
            return appendHex(this.mExistingUpdateTypes, charSequence);
        }
        fail$default(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    public boolean canConsumeValue() {
        int i = this.mExistingUpdateTypes;
        if (i == -1) {
            return false;
        }
        String str = (String) this.mOpReorderer;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.mExistingUpdateTypes = i;
                return (charAt == ',' || charAt == ':' || charAt == ']' || charAt == '}') ? false : true;
            }
            i++;
        }
        this.mExistingUpdateTypes = i;
        return false;
    }

    public boolean canFindInPreLayout(int i) {
        ArrayList arrayList = (ArrayList) this.mPostponedList;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            UpdateOp updateOp = (UpdateOp) arrayList.get(i2);
            int i3 = updateOp.cmd;
            if (i3 != 8) {
                if (i3 == 1) {
                    int i4 = updateOp.positionStart;
                    int i5 = updateOp.itemCount + i4;
                    while (i4 < i5) {
                        if (findPositionOffset(i4, i2 + 1) == i) {
                            return true;
                        }
                        i4++;
                    }
                } else {
                    continue;
                }
            } else {
                if (findPositionOffset(updateOp.itemCount, i2 + 1) == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public void consumeBooleanLiteral(int i, String str) {
        String str2 = (String) this.mOpReorderer;
        if (str2.length() - i < str.length()) {
            fail$default(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) != (str2.charAt(i + i2) | ' ')) {
                fail$default(this, "Expected valid boolean literal prefix, but had '" + consumeStringLenient() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.mExistingUpdateTypes = str.length() + i;
    }

    public String consumeKeyString() {
        String str;
        StringBuilder sb = (StringBuilder) this.mCallback;
        String str2 = (String) this.mOpReorderer;
        consumeNextToken('\"');
        int i = this.mExistingUpdateTypes;
        int indexOf$default = StringsKt.indexOf$default((CharSequence) str2, '\"', i, false, 4);
        if (indexOf$default == -1) {
            consumeStringLenient();
            int i2 = this.mExistingUpdateTypes;
            fail$default(this, JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Expected quotation mark '\"', but had '", (i2 == str2.length() || i2 < 0) ? "EOF" : String.valueOf(str2.charAt(i2)), "' instead"), i2, null, 4);
            throw null;
        }
        int i3 = i;
        while (i3 < indexOf$default) {
            if (str2.charAt(i3) == '\\') {
                int i4 = this.mExistingUpdateTypes;
                char charAt = str2.charAt(i3);
                boolean z = false;
                while (charAt != '\"') {
                    if (charAt == '\\') {
                        sb.append((CharSequence) str2, i4, i3);
                        int prefetchOrEof = prefetchOrEof(i3 + 1);
                        if (prefetchOrEof == -1) {
                            fail$default(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                            throw null;
                        }
                        int i5 = prefetchOrEof + 1;
                        char charAt2 = str2.charAt(prefetchOrEof);
                        if (charAt2 == 'u') {
                            i5 = appendHex(i5, str2);
                        } else {
                            char c = charAt2 < 'u' ? CharMappings.ESCAPE_2_CHAR[charAt2] : (char) 0;
                            if (c == 0) {
                                fail$default(this, "Invalid escaped char '" + charAt2 + '\'', 0, null, 6);
                                throw null;
                            }
                            sb.append(c);
                        }
                        i4 = prefetchOrEof(i5);
                        if (i4 == -1) {
                            fail$default(this, "Unexpected EOF", i4, null, 4);
                            throw null;
                        }
                    } else {
                        i3++;
                        if (i3 >= str2.length()) {
                            sb.append((CharSequence) str2, i4, i3);
                            i4 = prefetchOrEof(i3);
                            if (i4 == -1) {
                                fail$default(this, "Unexpected EOF", i4, null, 4);
                                throw null;
                            }
                        } else {
                            continue;
                            charAt = str2.charAt(i3);
                        }
                    }
                    i3 = i4;
                    z = true;
                    charAt = str2.charAt(i3);
                }
                if (z) {
                    sb.append((CharSequence) str2, i4, i3);
                    String sb2 = sb.toString();
                    sb.setLength(0);
                    str = sb2;
                } else {
                    str = str2.subSequence(i4, i3).toString();
                }
                this.mExistingUpdateTypes = i3 + 1;
                return str;
            }
            i3++;
        }
        this.mExistingUpdateTypes = indexOf$default + 1;
        return str2.substring(i, indexOf$default);
    }

    public void consumeNextToken(char c) {
        int i = this.mExistingUpdateTypes;
        if (i == -1) {
            unexpectedToken(c);
            throw null;
        }
        String str = (String) this.mOpReorderer;
        while (i < str.length()) {
            int i2 = i + 1;
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.mExistingUpdateTypes = i2;
                if (charAt == c) {
                    return;
                }
                unexpectedToken(c);
                throw null;
            }
            i = i2;
        }
        this.mExistingUpdateTypes = -1;
        unexpectedToken(c);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01b6, code lost:
    
        fail$default(r22, "Expected numeric literal", r12, null, 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01bc, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0121, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0104, code lost:
    
        fail$default(r22, "Unexpected symbol '" + r15 + "' in numeric literal", r12, null, 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0118, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x011d, code lost:
    
        if (r12 == r1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x011f, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0122, code lost:
    
        if (r1 == r12) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0124, code lost:
    
        if (r14 == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0128, code lost:
    
        if (r1 == (r12 - 1)) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x012e, code lost:
    
        if (r20 == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0130, code lost:
    
        if (r3 == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0138, code lost:
    
        if (r2.charAt(r12) != '\"') goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x013a, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x013d, code lost:
    
        fail$default(r22, "Expected closing quotation mark", r12, null, 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0144, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0145, code lost:
    
        fail$default(r22, "EOF", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x014b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x014c, code lost:
    
        r22.mExistingUpdateTypes = r12;
        r1 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0150, code lost:
    
        if (r21 == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0152, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0155, code lost:
    
        if (r11 != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0157, code lost:
    
        r3 = java.lang.Math.pow(10.0d, -r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0166, code lost:
    
        r1 = r1 * r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x016b, code lost:
    
        if (r1 > 9.223372036854776E18d) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0171, code lost:
    
        if (r1 < (-9.223372036854776E18d)) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0179, code lost:
    
        if (java.lang.Math.floor(r1) != r1) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x017b, code lost:
    
        r10 = (long) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01a5, code lost:
    
        if (r14 == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01a7, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ac, code lost:
    
        if (r10 == Long.MIN_VALUE) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01af, code lost:
    
        return -r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01b0, code lost:
    
        fail$default(r22, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b5, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x017e, code lost:
    
        fail$default(r22, "Can't convert " + r1 + " to Long", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0197, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0198, code lost:
    
        fail$default(r22, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x019e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x015f, code lost:
    
        if (r11 != true) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0161, code lost:
    
        r3 = java.lang.Math.pow(10.0d, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x019f, code lost:
    
        defpackage.Drop$$ExternalSyntheticBUOutline0.m1m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01a2, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01a3, code lost:
    
        r10 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long consumeNumericLiteral() {
        boolean z;
        boolean z2;
        boolean z3;
        int prefetchOrEof = prefetchOrEof(skipWhitespaces());
        String str = (String) this.mOpReorderer;
        if (prefetchOrEof < str.length() && prefetchOrEof != -1) {
            if (str.charAt(prefetchOrEof) == '\"') {
                prefetchOrEof++;
                if (prefetchOrEof == str.length()) {
                    fail$default(this, "EOF", 0, null, 6);
                    throw null;
                }
                z = true;
            } else {
                z = false;
            }
            int i = prefetchOrEof;
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            long j = 0;
            long j2 = 0;
            while (true) {
                if (i == str.length()) {
                    z2 = z;
                    z3 = z5;
                    break;
                }
                char charAt = str.charAt(i);
                if ((charAt != 'e' && charAt != 'E') || z5) {
                    z2 = z;
                    if (charAt == '-' && z5) {
                        if (i == prefetchOrEof) {
                            fail$default(this, "Unexpected symbol '-' in numeric literal", i, null, 4);
                            throw null;
                        }
                        i++;
                        z = z2;
                        z4 = false;
                    } else if (charAt != '+' || !z5) {
                        z3 = z5;
                        if (charAt != '-') {
                            if (WriteModeKt.charToTokenClass(charAt) != 0) {
                                break;
                            }
                            int i2 = i + 1;
                            int i3 = charAt - '0';
                            if (i3 < 0 || i3 >= 10) {
                                break;
                            }
                            if (z3) {
                                j = (j * 10) + i3;
                            } else {
                                j2 = (j2 * 10) - i3;
                                if (j2 > 0) {
                                    fail$default(this, "Numeric value overflow", 0, null, 6);
                                    throw null;
                                }
                            }
                            i = i2;
                            z = z2;
                            z5 = z3;
                        } else {
                            if (i != prefetchOrEof) {
                                fail$default(this, "Unexpected symbol '-' in numeric literal", i, null, 4);
                                throw null;
                            }
                            i++;
                            z = z2;
                            z5 = z3;
                            z6 = true;
                        }
                    } else {
                        if (i == prefetchOrEof) {
                            fail$default(this, "Unexpected symbol '+' in numeric literal", i, null, 4);
                            throw null;
                        }
                        i++;
                        z = z2;
                        z4 = true;
                    }
                } else {
                    if (i == prefetchOrEof) {
                        fail$default(this, "Unexpected symbol '" + charAt + "' in numeric literal", i, null, 4);
                        throw null;
                    }
                    i++;
                    z4 = true;
                    z5 = true;
                }
            }
        } else {
            fail$default(this, "EOF", 0, null, 6);
            throw null;
        }
    }

    public void consumePostponedUpdates() {
        ArrayList arrayList = (ArrayList) this.mPostponedList;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((RecyclerView.AnonymousClass7) this.mCallback).dispatchUpdate((UpdateOp) arrayList.get(i));
        }
        recycleUpdateOpsAndClearList(arrayList);
        this.mExistingUpdateTypes = 0;
    }

    public String consumeString() {
        String str = (String) this.mPostponedList;
        if (str == null) {
            return consumeKeyString();
        }
        str.getClass();
        this.mPostponedList = null;
        return str;
    }

    public String consumeStringLenient() {
        String str;
        StringBuilder sb = (StringBuilder) this.mCallback;
        String str2 = (String) this.mOpReorderer;
        String str3 = (String) this.mPostponedList;
        if (str3 != null) {
            str3.getClass();
            this.mPostponedList = null;
            return str3;
        }
        int skipWhitespaces = skipWhitespaces();
        if (skipWhitespaces >= str2.length() || skipWhitespaces == -1) {
            fail$default(this, "EOF", skipWhitespaces, null, 4);
            throw null;
        }
        byte charToTokenClass = WriteModeKt.charToTokenClass(str2.charAt(skipWhitespaces));
        if (charToTokenClass == 1) {
            return consumeString();
        }
        if (charToTokenClass != 0) {
            fail$default(this, "Expected beginning of the string, but got " + str2.charAt(skipWhitespaces), 0, null, 6);
            throw null;
        }
        boolean z = false;
        while (WriteModeKt.charToTokenClass(str2.charAt(skipWhitespaces)) == 0) {
            skipWhitespaces++;
            if (skipWhitespaces >= str2.length()) {
                sb.append((CharSequence) str2, this.mExistingUpdateTypes, skipWhitespaces);
                int prefetchOrEof = prefetchOrEof(skipWhitespaces);
                if (prefetchOrEof == -1) {
                    this.mExistingUpdateTypes = skipWhitespaces;
                    sb.append((CharSequence) str2, 0, 0);
                    String sb2 = sb.toString();
                    sb.setLength(0);
                    return sb2;
                }
                skipWhitespaces = prefetchOrEof;
                z = true;
            }
        }
        int i = this.mExistingUpdateTypes;
        if (z) {
            sb.append((CharSequence) str2, i, skipWhitespaces);
            String sb3 = sb.toString();
            sb.setLength(0);
            str = sb3;
        } else {
            str = str2.subSequence(i, skipWhitespaces).toString();
        }
        this.mExistingUpdateTypes = skipWhitespaces;
        return str;
    }

    public String consumeStringLenientNotNull() {
        String consumeStringLenient = consumeStringLenient();
        if (!Intrinsics.areEqual(consumeStringLenient, "null") || ((String) this.mOpReorderer).charAt(this.mExistingUpdateTypes - 1) == '\"') {
            return consumeStringLenient;
        }
        fail$default(this, "Unexpected 'null' value instead of string literal", 0, null, 6);
        throw null;
    }

    public void consumeUpdatesInOnePass() {
        RecyclerView.AnonymousClass7 anonymousClass7 = (RecyclerView.AnonymousClass7) this.mCallback;
        consumePostponedUpdates();
        ArrayList arrayList = (ArrayList) this.mPendingUpdates;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            UpdateOp updateOp = (UpdateOp) arrayList.get(i);
            int i2 = updateOp.cmd;
            if (i2 == 1) {
                anonymousClass7.dispatchUpdate(updateOp);
                anonymousClass7.offsetPositionsForAdd(updateOp.positionStart, updateOp.itemCount);
            } else if (i2 == 2) {
                anonymousClass7.dispatchUpdate(updateOp);
                int i3 = updateOp.positionStart;
                int i4 = updateOp.itemCount;
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.offsetPositionRecordsForRemove(i3, i4, true);
                recyclerView.mItemsAddedOrRemoved = true;
                recyclerView.mState.mDeletedInvisibleItemCountSincePreviousLayout += i4;
            } else if (i2 == 4) {
                anonymousClass7.dispatchUpdate(updateOp);
                anonymousClass7.markViewHoldersUpdated(updateOp.positionStart, updateOp.itemCount, updateOp.payload);
            } else if (i2 == 8) {
                anonymousClass7.dispatchUpdate(updateOp);
                anonymousClass7.offsetPositionsForMove(updateOp.positionStart, updateOp.itemCount);
            }
        }
        recycleUpdateOpsAndClearList(arrayList);
        this.mExistingUpdateTypes = 0;
    }

    public void dispatchAndUpdateViewHolders(UpdateOp updateOp) {
        int i;
        Pools$SimplePool pools$SimplePool = (Pools$SimplePool) this.mUpdateOpPool;
        int i2 = updateOp.cmd;
        if (i2 == 1 || i2 == 8) {
            a$$ExternalSyntheticBUOutline0.m$3("should not dispatch add or move for pre layout");
            return;
        }
        int updatePositionWithPostponed = updatePositionWithPostponed(updateOp.positionStart, i2);
        int i3 = updateOp.positionStart;
        int i4 = updateOp.cmd;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                OptionalProvider$$ExternalSyntheticLambda0.m((Object) updateOp, "op should be remove or update.");
                return;
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < updateOp.itemCount; i6++) {
            int updatePositionWithPostponed2 = updatePositionWithPostponed((i * i6) + updateOp.positionStart, updateOp.cmd);
            int i7 = updateOp.cmd;
            if (i7 == 2 ? updatePositionWithPostponed2 != updatePositionWithPostponed : !(i7 == 4 && updatePositionWithPostponed2 == updatePositionWithPostponed + 1)) {
                UpdateOp obtainUpdateOp = obtainUpdateOp(i7, updatePositionWithPostponed, updateOp.payload, i5);
                dispatchFirstPassAndUpdateViewHolders(obtainUpdateOp, i3);
                obtainUpdateOp.payload = null;
                pools$SimplePool.release(obtainUpdateOp);
                if (updateOp.cmd == 4) {
                    i3 += i5;
                }
                i5 = 1;
                updatePositionWithPostponed = updatePositionWithPostponed2;
            } else {
                i5++;
            }
        }
        Object obj = updateOp.payload;
        updateOp.payload = null;
        pools$SimplePool.release(updateOp);
        if (i5 > 0) {
            UpdateOp obtainUpdateOp2 = obtainUpdateOp(updateOp.cmd, updatePositionWithPostponed, obj, i5);
            dispatchFirstPassAndUpdateViewHolders(obtainUpdateOp2, i3);
            obtainUpdateOp2.payload = null;
            pools$SimplePool.release(obtainUpdateOp2);
        }
    }

    public void dispatchFirstPassAndUpdateViewHolders(UpdateOp updateOp, int i) {
        RecyclerView.AnonymousClass7 anonymousClass7 = (RecyclerView.AnonymousClass7) this.mCallback;
        anonymousClass7.dispatchUpdate(updateOp);
        int i2 = updateOp.cmd;
        if (i2 != 2) {
            if (i2 == 4) {
                anonymousClass7.markViewHoldersUpdated(i, updateOp.itemCount, updateOp.payload);
                return;
            } else {
                a$$ExternalSyntheticBUOutline0.m$3("only remove and update ops can be dispatched in first pass");
                return;
            }
        }
        int i3 = updateOp.itemCount;
        RecyclerView recyclerView = RecyclerView.this;
        recyclerView.offsetPositionRecordsForRemove(i, i3, true);
        recyclerView.mItemsAddedOrRemoved = true;
        recyclerView.mState.mDeletedInvisibleItemCountSincePreviousLayout += i3;
    }

    public void expectEof() {
        if (consumeNextToken() == 10) {
            return;
        }
        fail$default(this, "Expected EOF after parsing, but had " + ((String) this.mOpReorderer).charAt(this.mExistingUpdateTypes - 1) + " instead", 0, null, 6);
        throw null;
    }

    public void fail(int i, String str, String str2) {
        String path = ((zzv) this.mPendingUpdates).getPath();
        String str3 = (String) this.mOpReorderer;
        str3.getClass();
        throw new JsonDecodingException(WriteModeKt.formatDecodingException(str, i, path, str2, ((JsonConfiguration) this.mUpdateOpPool).exceptionsWithDebugInfo ? WriteModeKt.minify(i, str3).toString() : null));
    }

    public int findPositionOffset(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.mPostponedList;
        int size = arrayList.size();
        while (i2 < size) {
            UpdateOp updateOp = (UpdateOp) arrayList.get(i2);
            int i3 = updateOp.cmd;
            int i4 = updateOp.positionStart;
            if (i3 == 8) {
                if (i4 == i) {
                    i = updateOp.itemCount;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (updateOp.itemCount <= i) {
                        i++;
                    }
                }
            } else if (i4 > i) {
                continue;
            } else if (i3 == 2) {
                int i5 = updateOp.itemCount;
                if (i < i4 + i5) {
                    return -1;
                }
                i -= i5;
            } else if (i3 == 1) {
                i += updateOp.itemCount;
            }
            i2++;
        }
        return i;
    }

    public void flushQueueDownToSize(int i) {
        ArrayList arrayList;
        PriorityQueue priorityQueue = (PriorityQueue) this.mCallback;
        while (priorityQueue.size() > i) {
            ReorderingBufferQueue$BuffersWithTimestamp reorderingBufferQueue$BuffersWithTimestamp = (ReorderingBufferQueue$BuffersWithTimestamp) priorityQueue.poll();
            String str = Util.DEVICE_DEBUG_INFO;
            int i2 = 0;
            while (true) {
                arrayList = reorderingBufferQueue$BuffersWithTimestamp.nalBuffers;
                if (i2 >= arrayList.size()) {
                    break;
                }
                ((ExoPlayerImplInternal$$ExternalSyntheticLambda2) this.mUpdateOpPool).consume(reorderingBufferQueue$BuffersWithTimestamp.presentationTimeUs, (ParsableByteArray) arrayList.get(i2));
                ((ArrayDeque) this.mPendingUpdates).push((ParsableByteArray) arrayList.get(i2));
                i2++;
            }
            arrayList.clear();
            ReorderingBufferQueue$BuffersWithTimestamp reorderingBufferQueue$BuffersWithTimestamp2 = (ReorderingBufferQueue$BuffersWithTimestamp) this.mOpReorderer;
            if (reorderingBufferQueue$BuffersWithTimestamp2 != null && reorderingBufferQueue$BuffersWithTimestamp2.presentationTimeUs == reorderingBufferQueue$BuffersWithTimestamp.presentationTimeUs) {
                this.mOpReorderer = null;
            }
            ((ArrayDeque) this.mPostponedList).push(reorderingBufferQueue$BuffersWithTimestamp);
        }
    }

    public int fromHexChar(int i, CharSequence charSequence) {
        char charAt = charSequence.charAt(i);
        if ('0' <= charAt && charAt < ':') {
            return charAt - '0';
        }
        if ('a' <= charAt && charAt < 'g') {
            return charAt - 'W';
        }
        if ('A' <= charAt && charAt < 'G') {
            return charAt - '7';
        }
        fail$default(this, "Invalid toHexChar char '" + charAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    public boolean hasPendingUpdates() {
        return ((ArrayList) this.mPendingUpdates).size() > 0;
    }

    public UpdateOp obtainUpdateOp(int i, int i2, Object obj, int i3) {
        UpdateOp updateOp = (UpdateOp) ((Pools$SimplePool) this.mUpdateOpPool).acquire();
        if (updateOp != null) {
            updateOp.cmd = i;
            updateOp.positionStart = i2;
            updateOp.itemCount = i3;
            updateOp.payload = obj;
            return updateOp;
        }
        UpdateOp updateOp2 = new UpdateOp();
        updateOp2.cmd = i;
        updateOp2.positionStart = i2;
        updateOp2.itemCount = i3;
        updateOp2.payload = obj;
        return updateOp2;
    }

    public String peekLeadingMatchingValue(String str, boolean z) {
        str.getClass();
        int i = this.mExistingUpdateTypes;
        try {
            if (consumeNextToken() == 6 && Intrinsics.areEqual(peekString(z), str)) {
                this.mPostponedList = null;
                if (consumeNextToken() == 5) {
                    return peekString(z);
                }
            }
            return null;
        } finally {
            this.mExistingUpdateTypes = i;
            this.mPostponedList = null;
        }
    }

    public byte peekNextToken() {
        String str = (String) this.mOpReorderer;
        int i = this.mExistingUpdateTypes;
        while (true) {
            int prefetchOrEof = prefetchOrEof(i);
            if (prefetchOrEof == -1) {
                this.mExistingUpdateTypes = prefetchOrEof;
                return (byte) 10;
            }
            char charAt = str.charAt(prefetchOrEof);
            if (charAt != '\t' && charAt != '\n' && charAt != '\r' && charAt != ' ') {
                this.mExistingUpdateTypes = prefetchOrEof;
                return WriteModeKt.charToTokenClass(charAt);
            }
            i = prefetchOrEof + 1;
        }
    }

    public String peekString(boolean z) {
        String consumeString;
        byte peekNextToken = peekNextToken();
        if (z) {
            if (peekNextToken != 1 && peekNextToken != 0) {
                return null;
            }
            consumeString = consumeStringLenient();
        } else {
            if (peekNextToken != 1) {
                return null;
            }
            consumeString = consumeString();
        }
        this.mPostponedList = consumeString;
        return consumeString;
    }

    public void postponeAndUpdateViewHolders(UpdateOp updateOp) {
        RecyclerView.AnonymousClass7 anonymousClass7 = (RecyclerView.AnonymousClass7) this.mCallback;
        ((ArrayList) this.mPostponedList).add(updateOp);
        int i = updateOp.cmd;
        if (i == 1) {
            anonymousClass7.offsetPositionsForAdd(updateOp.positionStart, updateOp.itemCount);
            return;
        }
        if (i == 2) {
            int i2 = updateOp.positionStart;
            int i3 = updateOp.itemCount;
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.offsetPositionRecordsForRemove(i2, i3, false);
            recyclerView.mItemsAddedOrRemoved = true;
            return;
        }
        if (i == 4) {
            anonymousClass7.markViewHoldersUpdated(updateOp.positionStart, updateOp.itemCount, updateOp.payload);
        } else if (i == 8) {
            anonymousClass7.offsetPositionsForMove(updateOp.positionStart, updateOp.itemCount);
        } else {
            OptionalProvider$$ExternalSyntheticLambda0.m((Object) updateOp, "Unknown update op type for ");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0015 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0125 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void preProcess() {
        boolean z;
        char c;
        UpdateOp obtainUpdateOp;
        int i;
        int i2;
        UpdateOp obtainUpdateOp2;
        boolean z2;
        boolean z3;
        Object obj;
        UpdateOp updateOp;
        Pools$SimplePool pools$SimplePool = (Pools$SimplePool) this.mUpdateOpPool;
        RecyclerView.AnonymousClass7 anonymousClass7 = (RecyclerView.AnonymousClass7) this.mCallback;
        OpReorderer opReorderer = (OpReorderer) this.mOpReorderer;
        ArrayList arrayList = (ArrayList) this.mPendingUpdates;
        opReorderer.getClass();
        while (true) {
            int size = arrayList.size() - 1;
            boolean z4 = false;
            while (true) {
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((UpdateOp) arrayList.get(size)).cmd == 8) {
                    if (z4) {
                        break;
                    }
                } else {
                    z4 = true;
                }
                size--;
            }
            if (size == -1) {
                break;
            }
            int i3 = size + 1;
            AdapterHelper adapterHelper = (AdapterHelper) opReorderer.mCallback;
            Pools$SimplePool pools$SimplePool2 = (Pools$SimplePool) adapterHelper.mUpdateOpPool;
            UpdateOp updateOp2 = (UpdateOp) arrayList.get(size);
            UpdateOp updateOp3 = (UpdateOp) arrayList.get(i3);
            int i4 = updateOp3.cmd;
            if (i4 == 1) {
                int i5 = updateOp2.itemCount;
                int i6 = updateOp3.positionStart;
                int i7 = i5 < i6 ? -1 : 0;
                int i8 = updateOp2.positionStart;
                if (i8 < i6) {
                    i7++;
                }
                if (i6 <= i8) {
                    updateOp2.positionStart = i8 + updateOp3.itemCount;
                }
                int i9 = updateOp3.positionStart;
                if (i9 <= i5) {
                    updateOp2.itemCount = i5 + updateOp3.itemCount;
                }
                updateOp3.positionStart = i9 + i7;
                arrayList.set(size, updateOp3);
                arrayList.set(i3, updateOp2);
            } else if (i4 == 2) {
                int i10 = updateOp2.positionStart;
                int i11 = updateOp2.itemCount;
                int i12 = updateOp3.positionStart;
                if (i10 < i11) {
                    if (i12 == i10 && updateOp3.itemCount == i11 - i10) {
                        z2 = false;
                        z3 = true;
                    } else {
                        z2 = false;
                        z3 = false;
                    }
                } else if (i12 == i11 + 1 && updateOp3.itemCount == i10 - i11) {
                    z2 = true;
                    z3 = true;
                } else {
                    z2 = true;
                    z3 = false;
                }
                if (i11 < i12) {
                    updateOp3.positionStart = i12 - 1;
                } else {
                    int i13 = updateOp3.itemCount;
                    if (i11 < i12 + i13) {
                        updateOp3.itemCount = i13 - 1;
                        updateOp2.cmd = 2;
                        updateOp2.itemCount = 1;
                        if (updateOp3.itemCount == 0) {
                            arrayList.remove(i3);
                            updateOp3.payload = null;
                            pools$SimplePool2.release(updateOp3);
                        }
                    }
                }
                int i14 = updateOp2.positionStart;
                int i15 = updateOp3.positionStart;
                if (i14 <= i15) {
                    updateOp3.positionStart = i15 + 1;
                } else {
                    int i16 = i15 + updateOp3.itemCount;
                    if (i14 < i16) {
                        obj = null;
                        UpdateOp obtainUpdateOp3 = adapterHelper.obtainUpdateOp(2, i14 + 1, null, i16 - i14);
                        updateOp3.itemCount = updateOp2.positionStart - updateOp3.positionStart;
                        updateOp = obtainUpdateOp3;
                        if (z3) {
                            if (z2) {
                                if (updateOp != null) {
                                    int i17 = updateOp2.positionStart;
                                    if (i17 > updateOp.positionStart) {
                                        updateOp2.positionStart = i17 - updateOp.itemCount;
                                    }
                                    int i18 = updateOp2.itemCount;
                                    if (i18 > updateOp.positionStart) {
                                        updateOp2.itemCount = i18 - updateOp.itemCount;
                                    }
                                }
                                int i19 = updateOp2.positionStart;
                                if (i19 > updateOp3.positionStart) {
                                    updateOp2.positionStart = i19 - updateOp3.itemCount;
                                }
                                int i20 = updateOp2.itemCount;
                                if (i20 > updateOp3.positionStart) {
                                    updateOp2.itemCount = i20 - updateOp3.itemCount;
                                }
                            } else {
                                if (updateOp != null) {
                                    int i21 = updateOp2.positionStart;
                                    if (i21 >= updateOp.positionStart) {
                                        updateOp2.positionStart = i21 - updateOp.itemCount;
                                    }
                                    int i22 = updateOp2.itemCount;
                                    if (i22 >= updateOp.positionStart) {
                                        updateOp2.itemCount = i22 - updateOp.itemCount;
                                    }
                                }
                                int i23 = updateOp2.positionStart;
                                if (i23 >= updateOp3.positionStart) {
                                    updateOp2.positionStart = i23 - updateOp3.itemCount;
                                }
                                int i24 = updateOp2.itemCount;
                                if (i24 >= updateOp3.positionStart) {
                                    updateOp2.itemCount = i24 - updateOp3.itemCount;
                                }
                            }
                            arrayList.set(size, updateOp3);
                            if (updateOp2.positionStart != updateOp2.itemCount) {
                                arrayList.set(i3, updateOp2);
                            } else {
                                arrayList.remove(i3);
                            }
                            if (updateOp != null) {
                                arrayList.add(size, updateOp);
                            }
                        } else {
                            arrayList.set(size, updateOp3);
                            arrayList.remove(i3);
                            updateOp2.payload = obj;
                            pools$SimplePool2.release(updateOp2);
                        }
                    }
                }
                obj = null;
                updateOp = null;
                if (z3) {
                }
            } else if (i4 == 4) {
                int i25 = updateOp2.itemCount;
                int i26 = updateOp3.positionStart;
                if (i25 < i26) {
                    updateOp3.positionStart = i26 - 1;
                } else {
                    int i27 = updateOp3.itemCount;
                    if (i25 < i26 + i27) {
                        updateOp3.itemCount = i27 - 1;
                        obtainUpdateOp = adapterHelper.obtainUpdateOp(4, updateOp2.positionStart, updateOp3.payload, 1);
                        i = updateOp2.positionStart;
                        i2 = updateOp3.positionStart;
                        if (i > i2) {
                            updateOp3.positionStart = i2 + 1;
                        } else {
                            int i28 = i2 + updateOp3.itemCount;
                            if (i < i28) {
                                int i29 = i28 - i;
                                obtainUpdateOp2 = adapterHelper.obtainUpdateOp(4, i + 1, updateOp3.payload, i29);
                                updateOp3.itemCount -= i29;
                                arrayList.set(i3, updateOp2);
                                if (updateOp3.itemCount > 0) {
                                    arrayList.set(size, updateOp3);
                                } else {
                                    arrayList.remove(size);
                                    updateOp3.payload = null;
                                    pools$SimplePool2.release(updateOp3);
                                }
                                if (obtainUpdateOp != null) {
                                    arrayList.add(size, obtainUpdateOp);
                                }
                                if (obtainUpdateOp2 != null) {
                                    arrayList.add(size, obtainUpdateOp2);
                                }
                            }
                        }
                        obtainUpdateOp2 = null;
                        arrayList.set(i3, updateOp2);
                        if (updateOp3.itemCount > 0) {
                        }
                        if (obtainUpdateOp != null) {
                        }
                        if (obtainUpdateOp2 != null) {
                        }
                    }
                }
                obtainUpdateOp = null;
                i = updateOp2.positionStart;
                i2 = updateOp3.positionStart;
                if (i > i2) {
                }
                obtainUpdateOp2 = null;
                arrayList.set(i3, updateOp2);
                if (updateOp3.itemCount > 0) {
                }
                if (obtainUpdateOp != null) {
                }
                if (obtainUpdateOp2 != null) {
                }
            }
        }
        int size2 = arrayList.size();
        for (int i30 = 0; i30 < size2; i30++) {
            UpdateOp updateOp4 = (UpdateOp) arrayList.get(i30);
            int i31 = updateOp4.cmd;
            if (i31 == 1) {
                postponeAndUpdateViewHolders(updateOp4);
            } else if (i31 == 2) {
                int i32 = updateOp4.positionStart;
                int i33 = updateOp4.itemCount + i32;
                int i34 = i32;
                int i35 = 0;
                char c2 = 65535;
                while (i34 < i33) {
                    if (anonymousClass7.findViewHolder(i34) != null || canFindInPreLayout(i34)) {
                        if (c2 == 0) {
                            dispatchAndUpdateViewHolders(obtainUpdateOp(2, i32, null, i35));
                            z = true;
                        } else {
                            z = false;
                        }
                        c = 1;
                    } else {
                        if (c2 == 1) {
                            postponeAndUpdateViewHolders(obtainUpdateOp(2, i32, null, i35));
                            z = true;
                        } else {
                            z = false;
                        }
                        c = 0;
                    }
                    if (z) {
                        i34 -= i35;
                        i33 -= i35;
                        i35 = 1;
                    } else {
                        i35++;
                    }
                    i34++;
                    c2 = c;
                }
                if (i35 != updateOp4.itemCount) {
                    updateOp4.payload = null;
                    pools$SimplePool.release(updateOp4);
                    updateOp4 = obtainUpdateOp(2, i32, null, i35);
                }
                if (c2 == 0) {
                    dispatchAndUpdateViewHolders(updateOp4);
                } else {
                    postponeAndUpdateViewHolders(updateOp4);
                }
            } else if (i31 == 4) {
                int i36 = updateOp4.positionStart;
                int i37 = updateOp4.itemCount + i36;
                int i38 = i36;
                int i39 = 0;
                char c3 = 65535;
                while (i36 < i37) {
                    if (anonymousClass7.findViewHolder(i36) != null || canFindInPreLayout(i36)) {
                        if (c3 == 0) {
                            dispatchAndUpdateViewHolders(obtainUpdateOp(4, i38, updateOp4.payload, i39));
                            i38 = i36;
                            i39 = 0;
                        }
                        c3 = 1;
                    } else {
                        if (c3 == 1) {
                            postponeAndUpdateViewHolders(obtainUpdateOp(4, i38, updateOp4.payload, i39));
                            i38 = i36;
                            i39 = 0;
                        }
                        c3 = 0;
                    }
                    i39++;
                    i36++;
                }
                if (i39 != updateOp4.itemCount) {
                    Object obj2 = updateOp4.payload;
                    updateOp4.payload = null;
                    pools$SimplePool.release(updateOp4);
                    updateOp4 = obtainUpdateOp(4, i38, obj2, i39);
                }
                if (c3 == 0) {
                    dispatchAndUpdateViewHolders(updateOp4);
                } else {
                    postponeAndUpdateViewHolders(updateOp4);
                }
            } else if (i31 == 8) {
                postponeAndUpdateViewHolders(updateOp4);
            }
        }
        arrayList.clear();
    }

    public int prefetchOrEof(int i) {
        if (i < ((String) this.mOpReorderer).length()) {
            return i;
        }
        return -1;
    }

    public void recycleUpdateOpsAndClearList(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            UpdateOp updateOp = (UpdateOp) arrayList.get(i);
            updateOp.payload = null;
            ((Pools$SimplePool) this.mUpdateOpPool).release(updateOp);
        }
        arrayList.clear();
    }

    public void runInBackground(Runnable runnable) {
        SystemHandlerWrapper systemHandlerWrapper = (SystemHandlerWrapper) this.mUpdateOpPool;
        if (systemHandlerWrapper.handler.getLooper().getThread().isAlive()) {
            systemHandlerWrapper.post(runnable);
        }
    }

    public void setMaxSize(int i) {
        Trace.checkState(i >= 0);
        this.mExistingUpdateTypes = i;
        flushQueueDownToSize(i);
    }

    public int skipWhitespaces() {
        char charAt;
        int i = this.mExistingUpdateTypes;
        if (i == -1) {
            return i;
        }
        String str = (String) this.mOpReorderer;
        while (i < str.length() && ((charAt = str.charAt(i)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
            i++;
        }
        this.mExistingUpdateTypes = i;
        return i;
    }

    public void styleItem(TextView textView) {
        ColorStateList colorStateList = (ColorStateList) this.mPendingUpdates;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable();
        ShapeAppearanceModel shapeAppearanceModel = (ShapeAppearanceModel) this.mOpReorderer;
        materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModel);
        materialShapeDrawable2.setShapeAppearanceModel(shapeAppearanceModel);
        materialShapeDrawable.setFillColor((ColorStateList) this.mPostponedList);
        float f = this.mExistingUpdateTypes;
        ColorStateList colorStateList2 = (ColorStateList) this.mCallback;
        materialShapeDrawable.drawableState.strokeWidth = f;
        materialShapeDrawable.invalidateSelf();
        materialShapeDrawable.setStrokeColor(colorStateList2);
        textView.setTextColor(colorStateList);
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateList.withAlpha(30), materialShapeDrawable, materialShapeDrawable2);
        Rect rect = (Rect) this.mUpdateOpPool;
        textView.setBackground(new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 4:
                StringBuilder sb = new StringBuilder("JsonReader(source='");
                sb.append(this.mOpReorderer);
                sb.append("', currentPosition=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.mExistingUpdateTypes, ')');
            default:
                return super.toString();
        }
    }

    public boolean tryConsumeComma() {
        int skipWhitespaces = skipWhitespaces();
        String str = (String) this.mOpReorderer;
        if (skipWhitespaces >= str.length() || skipWhitespaces == -1 || str.charAt(skipWhitespaces) != ',') {
            return false;
        }
        this.mExistingUpdateTypes++;
        return true;
    }

    public boolean tryConsumeNull(boolean z) {
        int prefetchOrEof = prefetchOrEof(skipWhitespaces());
        String str = (String) this.mOpReorderer;
        int length = str.length() - prefetchOrEof;
        if (length >= 4 && prefetchOrEof != -1) {
            int i = 0;
            while (true) {
                if (i < 4) {
                    if ("null".charAt(i) != str.charAt(prefetchOrEof + i)) {
                        break;
                    }
                    i++;
                } else if (length <= 4 || WriteModeKt.charToTokenClass(str.charAt(prefetchOrEof + 4)) != 0) {
                    if (z) {
                        this.mExistingUpdateTypes = prefetchOrEof + 4;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public void unexpectedToken(char c) {
        String str = (String) this.mOpReorderer;
        int i = this.mExistingUpdateTypes;
        if (i > 0 && c == '\"') {
            try {
                this.mExistingUpdateTypes = i - 1;
                String consumeStringLenient = consumeStringLenient();
                this.mExistingUpdateTypes = i;
                if (Intrinsics.areEqual(consumeStringLenient, "null")) {
                    fail(this.mExistingUpdateTypes - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.mExistingUpdateTypes = i;
                throw th;
            }
        }
        String str2 = WriteModeKt.tokenDescription(WriteModeKt.charToTokenClass(c));
        int i2 = this.mExistingUpdateTypes;
        int i3 = i2 > 0 ? i2 - 1 : i2;
        fail$default(this, Boxes$$ExternalSyntheticOutline1.m("Expected ", str2, ", but had '", (i2 == str.length() || i3 < 0) ? "EOF" : String.valueOf(str.charAt(i3)), "' instead"), i3, null, 4);
        throw null;
    }

    public int updatePositionWithPostponed(int i, int i2) {
        int i3;
        int i4;
        Pools$SimplePool pools$SimplePool = (Pools$SimplePool) this.mUpdateOpPool;
        ArrayList arrayList = (ArrayList) this.mPostponedList;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            UpdateOp updateOp = (UpdateOp) arrayList.get(size);
            int i5 = updateOp.cmd;
            int i6 = updateOp.positionStart;
            if (i5 == 8) {
                int i7 = updateOp.itemCount;
                if (i6 < i7) {
                    i4 = i7;
                    i3 = i6;
                } else {
                    i3 = i7;
                    i4 = i6;
                }
                if (i < i3 || i > i4) {
                    if (i < i6) {
                        if (i2 == 1) {
                            updateOp.positionStart = i6 + 1;
                            updateOp.itemCount = i7 + 1;
                        } else if (i2 == 2) {
                            updateOp.positionStart = i6 - 1;
                            updateOp.itemCount = i7 - 1;
                        }
                    }
                } else if (i3 == i6) {
                    if (i2 == 1) {
                        updateOp.itemCount = i7 + 1;
                    } else if (i2 == 2) {
                        updateOp.itemCount = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        updateOp.positionStart = i6 + 1;
                    } else if (i2 == 2) {
                        updateOp.positionStart = i6 - 1;
                    }
                    i--;
                }
            } else if (i6 <= i) {
                if (i5 == 1) {
                    i -= updateOp.itemCount;
                } else if (i5 == 2) {
                    i += updateOp.itemCount;
                }
            } else if (i2 == 1) {
                updateOp.positionStart = i6 + 1;
            } else if (i2 == 2) {
                updateOp.positionStart = i6 - 1;
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            UpdateOp updateOp2 = (UpdateOp) arrayList.get(size2);
            int i8 = updateOp2.cmd;
            int i9 = updateOp2.itemCount;
            if (i8 == 8) {
                if (i9 == updateOp2.positionStart || i9 < 0) {
                    arrayList.remove(size2);
                    updateOp2.payload = null;
                    pools$SimplePool.release(updateOp2);
                }
            } else if (i9 <= 0) {
                arrayList.remove(size2);
                updateOp2.payload = null;
                pools$SimplePool.release(updateOp2);
            }
        }
        return i;
    }

    public void updateStateInForeground(Object obj) {
        Object obj2 = this.mCallback;
        this.mCallback = obj;
        if (obj2.equals(obj)) {
            return;
        }
        ExoPlayerImpl exoPlayerImpl = ((ExoPlayerImpl$$ExternalSyntheticLambda19) this.mPostponedList).f$0;
        ((Integer) obj2).getClass();
        Integer num = (Integer) obj;
        int intValue = num.intValue();
        exoPlayerImpl.verifyApplicationThread();
        exoPlayerImpl.sendRendererMessage(1, 10, num);
        exoPlayerImpl.sendRendererMessage(2, 10, num);
        exoPlayerImpl.listeners.sendEvent(21, new ExoPlayerImpl$$ExternalSyntheticLambda25(intValue, 0));
    }

    public AdapterHelper(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, ShapeAppearanceModel shapeAppearanceModel, Rect rect) {
        this.$r8$classId = 3;
        TransactorKt.checkArgumentNonnegative(rect.left);
        TransactorKt.checkArgumentNonnegative(rect.top);
        TransactorKt.checkArgumentNonnegative(rect.right);
        TransactorKt.checkArgumentNonnegative(rect.bottom);
        this.mUpdateOpPool = rect;
        this.mPendingUpdates = colorStateList2;
        this.mPostponedList = colorStateList;
        this.mCallback = colorStateList3;
        this.mExistingUpdateTypes = i;
        this.mOpReorderer = shapeAppearanceModel;
    }

    public AdapterHelper(ExoPlayerImplInternal$$ExternalSyntheticLambda2 exoPlayerImplInternal$$ExternalSyntheticLambda2) {
        this.$r8$classId = 2;
        this.mUpdateOpPool = exoPlayerImplInternal$$ExternalSyntheticLambda2;
        this.mPendingUpdates = new ArrayDeque();
        this.mPostponedList = new ArrayDeque();
        this.mCallback = new PriorityQueue();
        this.mExistingUpdateTypes = -1;
    }

    public AdapterHelper(Object obj, Looper looper, Looper looper2, SystemClock systemClock, ExoPlayerImpl$$ExternalSyntheticLambda19 exoPlayerImpl$$ExternalSyntheticLambda19) {
        this.$r8$classId = 1;
        this.mUpdateOpPool = systemClock.createHandler(looper, null);
        this.mPendingUpdates = systemClock.createHandler(looper2, null);
        this.mCallback = obj;
        this.mOpReorderer = obj;
        this.mPostponedList = exoPlayerImpl$$ExternalSyntheticLambda19;
    }

    public byte consumeNextToken() {
        String str = (String) this.mOpReorderer;
        int i = this.mExistingUpdateTypes;
        while (i != -1 && i < str.length()) {
            int i2 = i + 1;
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.mExistingUpdateTypes = i2;
                return WriteModeKt.charToTokenClass(charAt);
            }
            i = i2;
        }
        this.mExistingUpdateTypes = str.length();
        return (byte) 10;
    }

    public AdapterHelper(String str, JsonConfiguration jsonConfiguration) {
        this.$r8$classId = 4;
        str.getClass();
        this.mUpdateOpPool = jsonConfiguration;
        this.mPendingUpdates = new zzv(jsonConfiguration);
        this.mCallback = new StringBuilder();
        this.mOpReorderer = str;
    }

    public byte consumeNextToken(byte b) {
        String str = (String) this.mOpReorderer;
        byte consumeNextToken = consumeNextToken();
        if (consumeNextToken == b) {
            return consumeNextToken;
        }
        String str2 = WriteModeKt.tokenDescription(b);
        int i = this.mExistingUpdateTypes;
        int i2 = i > 0 ? i - 1 : i;
        fail$default(this, Boxes$$ExternalSyntheticOutline1.m("Expected ", str2, ", but had '", (i == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' instead"), i2, null, 4);
        throw null;
    }
}
