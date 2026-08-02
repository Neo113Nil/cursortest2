package com.fidesmo.sec.perso;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/fidesmo/sec/perso/PersonalizationUpdate;", "", "step", "Lcom/fidesmo/sec/perso/PersoStep;", "message", "", "(Lcom/fidesmo/sec/perso/PersoStep;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getStep", "()Lcom/fidesmo/sec/perso/PersoStep;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PersonalizationUpdate {
    private final String message;
    private final PersoStep step;

    public PersonalizationUpdate(PersoStep persoStep, String str) {
        persoStep.getClass();
        str.getClass();
        this.step = persoStep;
        this.message = str;
    }

    public static /* synthetic */ PersonalizationUpdate copy$default(PersonalizationUpdate personalizationUpdate, PersoStep persoStep, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            persoStep = personalizationUpdate.step;
        }
        if ((i & 2) != 0) {
            str = personalizationUpdate.message;
        }
        return personalizationUpdate.copy(persoStep, str);
    }

    /* renamed from: component1, reason: from getter */
    public final PersoStep getStep() {
        return this.step;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final PersonalizationUpdate copy(PersoStep step, String message) {
        step.getClass();
        message.getClass();
        return new PersonalizationUpdate(step, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PersonalizationUpdate)) {
            return false;
        }
        PersonalizationUpdate personalizationUpdate = (PersonalizationUpdate) other;
        return Intrinsics.areEqual(this.step, personalizationUpdate.step) && Intrinsics.areEqual(this.message, personalizationUpdate.message);
    }

    public final String getMessage() {
        return this.message;
    }

    public final PersoStep getStep() {
        return this.step;
    }

    public int hashCode() {
        return this.message.hashCode() + (this.step.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PersonalizationUpdate(step=");
        sb.append(this.step);
        sb.append(", message=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.message, ')');
    }
}
