package com.squareup.cash.securitysignals.models;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class TouchEvent {
    public final int actionValue;
    public final int buttonStates;
    public final int deviceId;
    public final int edgeFlag;
    public final int flags;
    public final int metaState;
    public final ArrayList pointers;
    public final long time;

    public TouchEvent(long j, int i, int i2, int i3, int i4, int i5, int i6, ArrayList arrayList) {
        this.time = j;
        this.deviceId = i;
        this.actionValue = i2;
        this.edgeFlag = i3;
        this.metaState = i4;
        this.flags = i5;
        this.buttonStates = i6;
        this.pointers = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TouchEvent)) {
            return false;
        }
        TouchEvent touchEvent = (TouchEvent) obj;
        return this.time == touchEvent.time && this.deviceId == touchEvent.deviceId && this.actionValue == touchEvent.actionValue && this.edgeFlag == touchEvent.edgeFlag && this.metaState == touchEvent.metaState && this.flags == touchEvent.flags && this.buttonStates == touchEvent.buttonStates && this.pointers.equals(touchEvent.pointers);
    }

    public final int getActionValue() {
        return this.actionValue;
    }

    public final int getButtonStates() {
        return this.buttonStates;
    }

    public final int getDeviceId() {
        return this.deviceId;
    }

    public final int getEdgeFlag() {
        return this.edgeFlag;
    }

    public final int getFlags() {
        return this.flags;
    }

    public final int getMetaState() {
        return this.metaState;
    }

    public final List getPointers() {
        return this.pointers;
    }

    public final long getTime() {
        return this.time;
    }

    public final int hashCode() {
        return this.pointers.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.buttonStates, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.flags, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.metaState, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.edgeFlag, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.actionValue, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.deviceId, Long.hashCode(this.time) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TouchEvent(time=");
        sb.append(this.time);
        sb.append(", deviceId=");
        sb.append(this.deviceId);
        Fragment$5$$ExternalSyntheticOutline0.m(this.actionValue, this.edgeFlag, ", actionValue=", ", edgeFlag=", sb);
        Fragment$5$$ExternalSyntheticOutline0.m(this.metaState, this.flags, ", metaState=", ", flags=", sb);
        sb.append(", buttonStates=");
        sb.append(this.buttonStates);
        sb.append(", pointers=");
        sb.append(this.pointers);
        sb.append(")");
        return sb.toString();
    }
}
