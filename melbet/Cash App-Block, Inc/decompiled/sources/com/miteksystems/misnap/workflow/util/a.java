package com.miteksystems.misnap.workflow.util;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes4.dex */
public final class a {
    public final long a;
    public final long b;
    public final boolean c;

    public a(boolean z, long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int m = Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.a) * 31, 31, this.b);
        boolean z = this.c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return m + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RunnableEntry(startTime=");
        sb.append(this.a);
        sb.append(", delay=");
        sb.append(this.b);
        sb.append(", isRunning=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.c, ')');
    }
}
