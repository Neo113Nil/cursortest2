package com.google.firebase.events;

import com.google.firebase.DataCollectionDefaultChange;

/* loaded from: classes4.dex */
public final class Event {
    public final DataCollectionDefaultChange payload;

    public Event(DataCollectionDefaultChange dataCollectionDefaultChange) {
        this.payload = dataCollectionDefaultChange;
    }

    public final Object getPayload() {
        return this.payload;
    }

    public final String toString() {
        return "Event{type: " + DataCollectionDefaultChange.class + ", payload: " + this.payload + "}";
    }
}
