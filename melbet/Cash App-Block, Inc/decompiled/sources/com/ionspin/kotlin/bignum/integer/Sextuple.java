package com.ionspin.kotlin.bignum.integer;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.Arrays;
import kotlin.ULongArray;

/* loaded from: classes4.dex */
public final class Sextuple {
    public final Integer a;
    public final Integer b;
    public final ULongArray c;
    public final ULongArray d;
    public final Integer e;
    public final Integer f;

    public Sextuple(Integer num, Integer num2, ULongArray uLongArray, ULongArray uLongArray2, Integer num3, Integer num4) {
        this.a = num;
        this.b = num2;
        this.c = uLongArray;
        this.d = uLongArray2;
        this.e = num3;
        this.f = num4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Sextuple)) {
            return false;
        }
        Sextuple sextuple = (Sextuple) obj;
        return this.a.equals(sextuple.a) && this.b.equals(sextuple.b) && this.c.equals(sextuple.c) && this.d.equals(sextuple.d) && this.e.equals(sextuple.e) && this.f.equals(sextuple.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m((Arrays.hashCode(this.d.storage) + ((Arrays.hashCode(this.c.storage) + CameraState$Type$EnumUnboxingLocalUtility.m(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31, 31, this.e);
    }

    public final String toString() {
        return "Sextuple(a=" + this.a + ", b=" + this.b + ", c=" + this.c + ", d=" + this.d + ", e=" + this.e + ", f=" + this.f + ")";
    }
}
