package androidx.constraintlayout.core.parser;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import java.util.Arrays;
import java.util.Objects;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public abstract class CLElement implements Cloneable {
    public CLContainer mContainer;
    public final char[] mContent;
    public long mStart = -1;
    public long mEnd = Long.MAX_VALUE;

    public CLElement(char[] cArr) {
        this.mContent = cArr;
    }

    @Override // 
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public CLElement mo1081clone() {
        try {
            return (CLElement) super.clone();
        } catch (CloneNotSupportedException unused) {
            Path$$ExternalSyntheticBUOutline0.m$2();
            return null;
        }
    }

    public final String content() {
        String str = new String(this.mContent);
        if (str.length() < 1) {
            return "";
        }
        long j = this.mEnd;
        if (j != Long.MAX_VALUE) {
            long j2 = this.mStart;
            if (j >= j2) {
                return str.substring((int) j2, ((int) j) + 1);
            }
        }
        long j3 = this.mStart;
        return str.substring((int) j3, ((int) j3) + 1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CLElement)) {
            return false;
        }
        CLElement cLElement = (CLElement) obj;
        if (this.mStart == cLElement.mStart && this.mEnd == cLElement.mEnd && Arrays.equals(this.mContent, cLElement.mContent)) {
            return Objects.equals(this.mContainer, cLElement.mContainer);
        }
        return false;
    }

    public float getFloat() {
        if (this instanceof CLNumber) {
            return ((CLNumber) this).getFloat();
        }
        return Float.NaN;
    }

    public int getInt$1() {
        if (this instanceof CLNumber) {
            return ((CLNumber) this).getInt$1();
        }
        return 0;
    }

    public final String getStrClass() {
        String cls = getClass().toString();
        return cls.substring(cls.lastIndexOf(46) + 1);
    }

    public int hashCode() {
        int hashCode = Arrays.hashCode(this.mContent) * 31;
        long j = this.mStart;
        int i = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.mEnd;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        CLContainer cLContainer = this.mContainer;
        return (i2 + (cLContainer != null ? cLContainer.hashCode() : 0)) * 31;
    }

    public String toString() {
        long j = this.mStart;
        long j2 = this.mEnd;
        if (j > j2 || j2 == Long.MAX_VALUE) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass());
            sb.append(" (INVALID, ");
            sb.append(this.mStart);
            sb.append("-");
            return CameraState$Type$EnumUnboxingLocalUtility.m(this.mEnd, ")", sb);
        }
        String substring = new String(this.mContent).substring((int) this.mStart, ((int) this.mEnd) + 1);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getStrClass());
        sb2.append(" (");
        sb2.append(this.mStart);
        sb2.append(" : ");
        Fragment$5$$ExternalSyntheticOutline0.m(this.mEnd, ") <<", substring, sb2);
        sb2.append(">>");
        return sb2.toString();
    }
}
