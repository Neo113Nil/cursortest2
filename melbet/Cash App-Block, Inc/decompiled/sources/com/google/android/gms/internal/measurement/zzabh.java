package com.google.android.gms.internal.measurement;

import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.datastore.preferences.protobuf.ByteString$LiteralByteString;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.work.impl.WorkLauncherImpl;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.List;

/* loaded from: classes.dex */
public abstract class zzabh {
    public final /* synthetic */ int $r8$classId = 2;
    public int zza;
    public Object zzb;

    public zzabh(zzza zzzaVar, int i) {
        if (zzzaVar == null) {
            a$$ExternalSyntheticBUOutline0.m$3("format options cannot be null");
            throw null;
        }
        if (i < 0) {
            a$$ExternalSyntheticBUOutline0.m$3(Boxes$$ExternalSyntheticOutline1.m(i, "invalid index: ", new StringBuilder(String.valueOf(i).length() + 15)));
            throw null;
        }
        this.zza = i;
        this.zzb = zzzaVar;
    }

    public abstract void checkLastTagWas(int i);

    public abstract int getTotalBytesRead();

    public abstract boolean isAtEnd();

    public void onEnd(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
    }

    public void onPrepare(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
    }

    public abstract WindowInsetsCompat onProgress(WindowInsetsCompat windowInsetsCompat, List list);

    public WorkLauncherImpl onStart(WindowInsetsAnimationCompat windowInsetsAnimationCompat, WorkLauncherImpl workLauncherImpl) {
        return workLauncherImpl;
    }

    public abstract void popLimit(int i);

    public abstract int pushLimit(int i);

    public abstract boolean readBool();

    public abstract ByteString$LiteralByteString readBytes();

    public abstract double readDouble();

    public abstract int readEnum();

    public abstract int readFixed32();

    public abstract long readFixed64();

    public abstract float readFloat();

    public abstract int readInt32();

    public abstract long readInt64();

    public abstract int readSFixed32();

    public abstract long readSFixed64();

    public abstract int readSInt32();

    public abstract long readSInt64();

    public abstract String readString();

    public abstract String readStringRequireUtf8();

    public abstract int readTag();

    public abstract int readUInt32();

    public abstract long readUInt64();

    public abstract boolean skipField(int i);

    public void skipMessage() {
        int readTag;
        do {
            readTag = readTag();
            if (readTag == 0) {
                return;
            }
            int i = this.zza;
            if (i >= 100) {
                throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.zza = i + 1;
            this.zza--;
        } while (skipField(readTag));
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 3:
                return String.format("%s(0x%04x)", (String) this.zzb, Integer.valueOf(this.zza));
            default:
                return super.toString();
        }
    }

    public abstract void zzb(zzyy zzyyVar, Object obj);

    public /* synthetic */ zzabh() {
    }

    public zzabh(String str, int i) {
        this.zzb = str;
        this.zza = i;
    }

    public zzabh(int i) {
        this.zza = i;
    }
}
