package androidx.media3.common.util;

import android.content.Intent;
import android.content.IntentSender;
import android.content.res.TypedArray;
import android.util.SparseArray;
import androidx.activity.result.IntentSenderRequest;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.text.android.CharSequenceCharacterIterator;
import androidx.compose.ui.text.input.GapBuffer;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.core.graphics.ColorUtils;
import androidx.emoji2.text.EmojiCompat;
import androidx.media3.extractor.mp4.TrackEncryptionBox;
import androidx.tracing.Trace;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.caverock.androidsvg.NumberParser;
import com.caverock.androidsvg.SVG;
import com.google.android.gms.internal.mlkit_genai_prompt.zzahh;
import com.google.android.material.textfield.EndCompoundLayout;
import com.squareup.cash.mooncake.components.MooncakePillButton;
import com.squareup.cash.mooncake.components.MooncakePillButton$ButtonColors$WhenMappings;
import com.squareup.wire.GrpcMethod;
import java.lang.Character;
import java.text.BreakIterator;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class TimedValueQueue {
    public final /* synthetic */ int $r8$classId;
    public int first;
    public int size;
    public Object timestamps;
    public Object values;

    public TimedValueQueue(CharSequence charSequence, int i, Locale locale) {
        this.$r8$classId = 2;
        this.timestamps = charSequence;
        if (charSequence.length() < 0) {
            InlineClassHelperKt.throwIllegalArgumentException("input start index is outside the CharSequence");
        }
        if (i < 0 || i > charSequence.length()) {
            InlineClassHelperKt.throwIllegalArgumentException("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.values = wordInstance;
        this.first = Math.max(0, -50);
        this.size = Math.min(charSequence.length(), i + 50);
        wordInstance.setText(new CharSequenceCharacterIterator(i, charSequence));
    }

    public static boolean isWhitespace(int i) {
        return i == 32 || i == 10 || i == 13 || i == 9;
    }

    public static boolean isWhitespace$1(int i) {
        return i == 32 || i == 10 || i == 13 || i == 9;
    }

    public synchronized void add(Object obj, long j) {
        if (this.size > 0) {
            if (j <= ((long[]) this.timestamps)[((this.first + r0) - 1) % ((Object[]) this.values).length]) {
                clear();
            }
        }
        doubleCapacityIfFull();
        int i = this.first;
        int i2 = this.size;
        Object[] objArr = (Object[]) this.values;
        int length = (i + i2) % objArr.length;
        ((long[]) this.timestamps)[length] = j;
        objArr[length] = obj;
        this.size = i2 + 1;
    }

    public int advanceChar() {
        switch (this.$r8$classId) {
            case 7:
                int i = this.first;
                int i2 = this.size;
                if (i == i2) {
                    return -1;
                }
                int i3 = i + 1;
                this.first = i3;
                if (i3 < i2) {
                    return ((String) this.timestamps).charAt(i3);
                }
                return -1;
            default:
                int i4 = this.first;
                int i5 = this.size;
                if (i4 == i5) {
                    return -1;
                }
                int i6 = i4 + 1;
                this.first = i6;
                if (i6 < i5) {
                    return ((String) this.timestamps).charAt(i6);
                }
                return -1;
        }
    }

    public IntentSenderRequest build() {
        return new IntentSenderRequest((IntentSender) this.timestamps, (Intent) this.values, this.first, this.size);
    }

    public void checkOffsetIsValid(int i) {
        int i2 = this.first;
        int i3 = this.size;
        boolean z = false;
        if (i <= i3 && i2 <= i) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder m107m = Recorder$$ExternalSyntheticOutline2.m107m(i, i2, "Invalid offset: ", ". Valid range is [", " , ");
        m107m.append(i3);
        m107m.append(']');
        InlineClassHelperKt.throwIllegalArgumentException(m107m.toString());
    }

    public Boolean checkedNextFlag(Object obj) {
        switch (this.$r8$classId) {
            case 7:
                if (obj == null) {
                    return null;
                }
                m1142skipCommaWhitespace();
                int i = this.first;
                if (i == this.size) {
                    return null;
                }
                char charAt = ((String) this.timestamps).charAt(i);
                if (charAt != '0' && charAt != '1') {
                    return null;
                }
                this.first++;
                return Boolean.valueOf(charAt == '1');
            default:
                if (obj == null) {
                    return null;
                }
                skipCommaWhitespace();
                int i2 = this.first;
                if (i2 == this.size) {
                    return null;
                }
                char charAt2 = ((String) this.timestamps).charAt(i2);
                if (charAt2 != '0' && charAt2 != '1') {
                    return null;
                }
                this.first++;
                return Boolean.valueOf(charAt2 == '1');
        }
    }

    public float checkedNextFloat(float f) {
        switch (this.$r8$classId) {
            case 7:
                if (!Float.isNaN(f)) {
                    m1142skipCommaWhitespace();
                    break;
                }
                break;
            default:
                if (!Float.isNaN(f)) {
                    skipCommaWhitespace();
                    break;
                }
                break;
        }
        return nextFloat();
    }

    public synchronized void clear() {
        this.first = 0;
        this.size = 0;
        Arrays.fill((Object[]) this.values, (Object) null);
    }

    public boolean consume(String str) {
        int length = str.length();
        int i = this.first;
        boolean z = i <= this.size - length && ((String) this.timestamps).substring(i, i + length).equals(str);
        if (z) {
            this.first += length;
        }
        return z;
    }

    public void doubleCapacityIfFull() {
        int length = ((Object[]) this.values).length;
        if (this.size < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        Object[] objArr = new Object[i];
        int i2 = this.first;
        int i3 = length - i2;
        System.arraycopy((long[]) this.timestamps, i2, jArr, 0, i3);
        System.arraycopy((Object[]) this.values, this.first, objArr, 0, i3);
        int i4 = this.first;
        if (i4 > 0) {
            System.arraycopy((long[]) this.timestamps, 0, jArr, i3, i4);
            System.arraycopy((Object[]) this.values, 0, objArr, i3, this.first);
        }
        this.timestamps = jArr;
        this.values = objArr;
        this.first = 0;
    }

    public boolean empty() {
        switch (this.$r8$classId) {
            case 7:
                if (this.first == this.size) {
                }
                break;
            default:
                if (this.first == this.size) {
                }
                break;
        }
        return false;
    }

    public int getDisabledText() {
        MooncakePillButton mooncakePillButton = (MooncakePillButton) this.values;
        return MooncakePillButton$ButtonColors$WhenMappings.$EnumSwitchMapping$0[mooncakePillButton.style.ordinal()] == 1 ? mooncakePillButton.themeInfo.colorPalette.disabledLabel : ColorUtils.setAlphaComponent(this.first, 127);
    }

    public int getLength() {
        GapBuffer gapBuffer = (GapBuffer) this.values;
        String str = (String) this.timestamps;
        if (gapBuffer == null) {
            return str.length();
        }
        return (gapBuffer.capacity - gapBuffer.gapLength()) + (str.length() - (this.size - this.first));
    }

    public boolean isAfterLetterOrDigitOrEmoji(int i) {
        CharSequence charSequence = (CharSequence) this.timestamps;
        int i2 = this.first + 1;
        if (i > this.size || i2 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointBefore(charSequence, i))) {
            int i3 = i - 1;
            if (!Character.isSurrogate(charSequence.charAt(i3))) {
                if (!EmojiCompat.isConfigured()) {
                    return false;
                }
                EmojiCompat emojiCompat = EmojiCompat.get();
                if (emojiCompat.getLoadState() != 1 || emojiCompat.getEmojiStart(i3, charSequence) == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isAfterPunctuation(int i) {
        int i2 = this.first + 1;
        if (i > this.size || i2 > i) {
            return false;
        }
        return zzahh.isPunctuation$ui_text(Character.codePointBefore((CharSequence) this.timestamps, i));
    }

    public boolean isBoundary(int i) {
        checkOffsetIsValid(i);
        if (!((BreakIterator) this.values).isBoundary(i)) {
            return false;
        }
        if (isOnLetterOrDigitOrEmoji(i) && isOnLetterOrDigitOrEmoji(i - 1) && isOnLetterOrDigitOrEmoji(i + 1)) {
            return false;
        }
        return i <= 0 || i >= ((CharSequence) this.timestamps).length() - 1 || !(isHiraganaKatakanaBoundary(i) || isHiraganaKatakanaBoundary(i + 1));
    }

    public boolean isHiraganaKatakanaBoundary(int i) {
        CharSequence charSequence = (CharSequence) this.timestamps;
        int i2 = i - 1;
        Character.UnicodeBlock of = Character.UnicodeBlock.of(charSequence.charAt(i2));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (Intrinsics.areEqual(of, unicodeBlock) && Intrinsics.areEqual(Character.UnicodeBlock.of(charSequence.charAt(i)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return Intrinsics.areEqual(Character.UnicodeBlock.of(charSequence.charAt(i)), unicodeBlock) && Intrinsics.areEqual(Character.UnicodeBlock.of(charSequence.charAt(i2)), Character.UnicodeBlock.KATAKANA);
    }

    public boolean isOnLetterOrDigitOrEmoji(int i) {
        CharSequence charSequence = (CharSequence) this.timestamps;
        int i2 = this.first;
        if (i >= this.size || i2 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointAt(charSequence, i)) && !Character.isSurrogate(charSequence.charAt(i))) {
            if (!EmojiCompat.isConfigured()) {
                return false;
            }
            EmojiCompat emojiCompat = EmojiCompat.get();
            if (emojiCompat.getLoadState() != 1 || emojiCompat.getEmojiStart(i, charSequence) == -1) {
                return false;
            }
        }
        return true;
    }

    public boolean isOnPunctuation(int i) {
        int i2 = this.first;
        if (i >= this.size || i2 > i) {
            return false;
        }
        return zzahh.isPunctuation$ui_text(Character.codePointAt((CharSequence) this.timestamps, i));
    }

    public int nextBoundary(int i) {
        checkOffsetIsValid(i);
        int following = ((BreakIterator) this.values).following(i);
        return (isOnLetterOrDigitOrEmoji(following + (-1)) && isOnLetterOrDigitOrEmoji(following) && !isHiraganaKatakanaBoundary(following)) ? nextBoundary(following) : following;
    }

    public Integer nextChar() {
        int i = this.first;
        if (i == this.size) {
            return null;
        }
        String str = (String) this.timestamps;
        this.first = i + 1;
        return Integer.valueOf(str.charAt(i));
    }

    public float nextFloat() {
        switch (this.$r8$classId) {
            case 7:
                NumberParser numberParser = (NumberParser) this.values;
                float parseNumber = numberParser.parseNumber(this.first, this.size, (String) this.timestamps);
                if (!Float.isNaN(parseNumber)) {
                    this.first = numberParser.pos;
                }
                return parseNumber;
            default:
                com.squareup.cash.androidsvg.NumberParser numberParser2 = (com.squareup.cash.androidsvg.NumberParser) this.values;
                float parseNumber2 = numberParser2.parseNumber(this.first, this.size, (String) this.timestamps);
                if (!Float.isNaN(parseNumber2)) {
                    this.first = numberParser2.pos;
                }
                return parseNumber2;
        }
    }

    public SVG.Length nextLength() {
        float nextFloat = nextFloat();
        if (Float.isNaN(nextFloat)) {
            return null;
        }
        int nextUnit = nextUnit();
        return nextUnit == 0 ? new SVG.Length(nextFloat, 1) : new SVG.Length(nextFloat, nextUnit);
    }

    public String nextQuotedString() {
        String str = (String) this.timestamps;
        if (empty()) {
            return null;
        }
        int i = this.first;
        char charAt = str.charAt(i);
        if (charAt != '\'' && charAt != '\"') {
            return null;
        }
        int advanceChar = advanceChar();
        while (advanceChar != -1 && advanceChar != charAt) {
            advanceChar = advanceChar();
        }
        if (advanceChar == -1) {
            this.first = i;
            return null;
        }
        int i2 = this.first;
        this.first = i2 + 1;
        return str.substring(i + 1, i2);
    }

    public String nextToken() {
        switch (this.$r8$classId) {
            case 7:
                return nextToken(false, ' ');
            default:
                String str = (String) this.timestamps;
                if (!empty()) {
                    char charAt = str.charAt(this.first);
                    if (!isWhitespace$1(charAt) && charAt != ' ') {
                        int i = this.first;
                        int advanceChar = advanceChar();
                        while (advanceChar != -1 && advanceChar != 32 && !isWhitespace$1(advanceChar)) {
                            advanceChar = advanceChar();
                        }
                        return str.substring(i, this.first);
                    }
                }
                return null;
        }
    }

    public int nextUnit() {
        String str = (String) this.timestamps;
        if (empty()) {
            return 0;
        }
        char charAt = str.charAt(this.first);
        int i = this.first;
        if (charAt == '%') {
            this.first = i + 1;
            return 9;
        }
        if (i > this.size - 2) {
            return 0;
        }
        try {
            int valueOf$1 = Thread$State$EnumUnboxingLocalUtility.valueOf$1(str.substring(i, i + 2).toLowerCase(Locale.US));
            this.first += 2;
            return valueOf$1;
        } catch (IllegalArgumentException unused) {
            return 0;
        }
    }

    public Object poll(long j, boolean z) {
        Object obj = null;
        long j2 = Long.MAX_VALUE;
        while (this.size > 0) {
            long j3 = j - ((long[]) this.timestamps)[this.first];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            obj = popFirst();
            j2 = j3;
        }
        return obj;
    }

    public synchronized Object pollFirst() {
        return this.size == 0 ? null : popFirst();
    }

    public synchronized Object pollFloor(long j) {
        return poll(j, true);
    }

    public Object popFirst() {
        Trace.checkState(this.size > 0);
        Object[] objArr = (Object[]) this.values;
        int i = this.first;
        Object obj = objArr[i];
        objArr[i] = null;
        this.first = (i + 1) % objArr.length;
        this.size--;
        return obj;
    }

    public float possibleNextFloat() {
        switch (this.$r8$classId) {
            case 7:
                m1142skipCommaWhitespace();
                NumberParser numberParser = (NumberParser) this.values;
                float parseNumber = numberParser.parseNumber(this.first, this.size, (String) this.timestamps);
                if (!Float.isNaN(parseNumber)) {
                    this.first = numberParser.pos;
                }
                return parseNumber;
            default:
                skipCommaWhitespace();
                com.squareup.cash.androidsvg.NumberParser numberParser2 = (com.squareup.cash.androidsvg.NumberParser) this.values;
                float parseNumber2 = numberParser2.parseNumber(this.first, this.size, (String) this.timestamps);
                if (!Float.isNaN(parseNumber2)) {
                    this.first = numberParser2.pos;
                }
                return parseNumber2;
        }
    }

    public int prevBoundary(int i) {
        checkOffsetIsValid(i);
        int preceding = ((BreakIterator) this.values).preceding(i);
        return (isOnLetterOrDigitOrEmoji(preceding) && isAfterLetterOrDigitOrEmoji(preceding) && !isHiraganaKatakanaBoundary(preceding)) ? prevBoundary(preceding) : preceding;
    }

    public void replace(int i, int i2, String str) {
        if (i > i2) {
            InlineClassHelperKt.throwIllegalArgumentException("start index must be less than or equal to end index: " + i + " > " + i2);
        }
        if (i < 0) {
            InlineClassHelperKt.throwIllegalArgumentException("start must be non-negative, but was " + i);
        }
        GapBuffer gapBuffer = (GapBuffer) this.values;
        if (gapBuffer == null) {
            int max = Math.max(255, str.length() + 128);
            char[] cArr = new char[max];
            int min = Math.min(i, 64);
            int min2 = Math.min(((String) this.timestamps).length() - i2, 64);
            String str2 = (String) this.timestamps;
            int i3 = i - min;
            str2.getClass();
            str2.getChars(i3, i, cArr, 0);
            String str3 = (String) this.timestamps;
            int i4 = max - min2;
            int i5 = min2 + i2;
            str3.getClass();
            str3.getChars(i2, i5, cArr, i4);
            str.getChars(0, str.length(), cArr, min);
            int length = str.length() + min;
            GapBuffer gapBuffer2 = new GapBuffer();
            gapBuffer2.capacity = max;
            gapBuffer2.buffer = cArr;
            gapBuffer2.gapStart = length;
            gapBuffer2.gapEnd = i4;
            this.values = gapBuffer2;
            this.first = i3;
            this.size = i5;
            return;
        }
        int i6 = this.first;
        int i7 = i - i6;
        int i8 = i2 - i6;
        if (i7 < 0 || i8 > gapBuffer.capacity - gapBuffer.gapLength()) {
            this.timestamps = toString();
            this.values = null;
            this.first = -1;
            this.size = -1;
            replace(i, i2, str);
            return;
        }
        int length2 = str.length() - (i8 - i7);
        if (length2 > gapBuffer.gapLength()) {
            int gapLength = length2 - gapBuffer.gapLength();
            int i9 = gapBuffer.capacity;
            do {
                i9 *= 2;
            } while (i9 - gapBuffer.capacity < gapLength);
            char[] cArr2 = new char[i9];
            System.arraycopy(gapBuffer.buffer, 0, cArr2, 0, gapBuffer.gapStart);
            int i10 = gapBuffer.capacity;
            int i11 = gapBuffer.gapEnd;
            int i12 = i10 - i11;
            int i13 = i9 - i12;
            System.arraycopy(gapBuffer.buffer, i11, cArr2, i13, (i12 + i11) - i11);
            gapBuffer.buffer = cArr2;
            gapBuffer.capacity = i9;
            gapBuffer.gapEnd = i13;
        }
        int i14 = gapBuffer.gapStart;
        if (i7 < i14 && i8 <= i14) {
            int i15 = i14 - i8;
            char[] cArr3 = gapBuffer.buffer;
            System.arraycopy(cArr3, i8, cArr3, gapBuffer.gapEnd - i15, i15);
            gapBuffer.gapStart = i7;
            gapBuffer.gapEnd -= i15;
        } else if (i7 >= i14 || i8 < i14) {
            int gapLength2 = gapBuffer.gapLength() + i7;
            int gapLength3 = gapBuffer.gapLength() + i8;
            int i16 = gapBuffer.gapEnd;
            int i17 = gapLength2 - i16;
            char[] cArr4 = gapBuffer.buffer;
            System.arraycopy(cArr4, i16, cArr4, gapBuffer.gapStart, i17);
            gapBuffer.gapStart += i17;
            gapBuffer.gapEnd = gapLength3;
        } else {
            gapBuffer.gapEnd = gapBuffer.gapLength() + i8;
            gapBuffer.gapStart = i7;
        }
        str.getChars(0, str.length(), gapBuffer.buffer, gapBuffer.gapStart);
        gapBuffer.gapStart = str.length() + gapBuffer.gapStart;
    }

    public void setFillInIntent(Intent intent) {
        this.values = intent;
    }

    public void setFlags(int i, int i2) {
        this.size = i;
        this.first = i2;
    }

    public synchronized int size() {
        return this.size;
    }

    /* renamed from: skipCommaWhitespace, reason: collision with other method in class */
    public boolean m1142skipCommaWhitespace() {
        skipWhitespace();
        int i = this.first;
        if (i == this.size || ((String) this.timestamps).charAt(i) != ',') {
            return false;
        }
        this.first++;
        skipWhitespace();
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void skipWhitespace() {
        switch (this.$r8$classId) {
            case 7:
                while (true) {
                    int i = this.first;
                    if (i < this.size && isWhitespace(((String) this.timestamps).charAt(i))) {
                        this.first++;
                    }
                }
                break;
            default:
                while (true) {
                    int i2 = this.first;
                    if (i2 < this.size && isWhitespace$1(((String) this.timestamps).charAt(i2))) {
                        this.first++;
                    }
                }
                break;
        }
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 3:
                GapBuffer gapBuffer = (GapBuffer) this.values;
                String str = (String) this.timestamps;
                if (gapBuffer == null) {
                    return str;
                }
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) str, 0, this.first);
                sb.append(gapBuffer.buffer, 0, gapBuffer.gapStart);
                char[] cArr = gapBuffer.buffer;
                int i = gapBuffer.gapEnd;
                sb.append(cArr, i, gapBuffer.capacity - i);
                String str2 = (String) this.timestamps;
                sb.append((CharSequence) str2, this.size, str2.length());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void skipCommaWhitespace() {
        skipWhitespace();
        int i = this.first;
        if (i != this.size && ((String) this.timestamps).charAt(i) == ',') {
            this.first++;
            skipWhitespace();
        }
    }

    public boolean consume(char c) {
        int i = this.first;
        boolean z = i < this.size && ((String) this.timestamps).charAt(i) == c;
        if (z) {
            this.first++;
        }
        return z;
    }

    public boolean consume() {
        int i = this.first;
        boolean z = i < this.size && ((String) this.timestamps).charAt(i) == ')';
        if (z) {
            this.first++;
        }
        return z;
    }

    public TimedValueQueue(byte b, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 3:
                break;
            default:
                this.timestamps = new long[10];
                this.values = new Object[10];
                break;
        }
    }

    public String nextToken(boolean z, char c) {
        String str = (String) this.timestamps;
        if (empty()) {
            return null;
        }
        char charAt = str.charAt(this.first);
        if ((!z && isWhitespace(charAt)) || charAt == c) {
            return null;
        }
        int i = this.first;
        int advanceChar = advanceChar();
        while (advanceChar != -1 && advanceChar != c && (z || !isWhitespace(advanceChar))) {
            advanceChar = advanceChar();
        }
        return str.substring(i, this.first);
    }

    public TimedValueQueue(IntentSender intentSender) {
        this.$r8$classId = 1;
        intentSender.getClass();
        this.timestamps = intentSender;
    }

    public TimedValueQueue(int i, int i2, float[] fArr, float[] fArr2) {
        this.$r8$classId = 4;
        this.first = i;
        Trace.checkArgument(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
        this.timestamps = fArr;
        this.values = fArr2;
        this.size = i2;
    }

    public TimedValueQueue(TimedValueQueue timedValueQueue) {
        this.$r8$classId = 5;
        float[] fArr = (float[]) timedValueQueue.timestamps;
        this.first = fArr.length / 3;
        this.timestamps = Log.createBuffer(fArr);
        this.values = Log.createBuffer((float[]) timedValueQueue.values);
        int i = timedValueQueue.size;
        if (i == 1) {
            this.size = 5;
        } else if (i != 2) {
            this.size = 4;
        } else {
            this.size = 6;
        }
    }

    public TimedValueQueue(MooncakePillButton mooncakePillButton, int i, int i2, Pair pair) {
        this.$r8$classId = 10;
        this.values = mooncakePillButton;
        this.first = i;
        this.size = i2;
        this.timestamps = pair;
    }

    public TimedValueQueue(EndCompoundLayout endCompoundLayout, GrpcMethod grpcMethod) {
        this.$r8$classId = 8;
        this.timestamps = new SparseArray();
        this.values = endCompoundLayout;
        TypedArray typedArray = (TypedArray) grpcMethod.requestAdapter;
        this.first = typedArray.getResourceId(28, 0);
        this.size = typedArray.getResourceId(53, 0);
    }

    public TimedValueQueue(String str, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 9:
                this.first = 0;
                this.size = 0;
                this.values = new com.squareup.cash.androidsvg.NumberParser();
                String trim = str.trim();
                this.timestamps = trim;
                this.size = trim.length();
                break;
            default:
                this.first = 0;
                this.size = 0;
                this.values = new NumberParser();
                String trim2 = str.trim();
                this.timestamps = trim2;
                this.size = trim2.length();
                break;
        }
    }

    public TimedValueQueue(int i) {
        this.$r8$classId = 6;
        this.timestamps = new TrackEncryptionBox[i];
        this.size = 0;
    }
}
