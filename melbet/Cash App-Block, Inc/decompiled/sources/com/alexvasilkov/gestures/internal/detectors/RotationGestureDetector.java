package com.alexvasilkov.gestures.internal.detectors;

import com.alexvasilkov.gestures.GestureController;

/* loaded from: classes3.dex */
public final class RotationGestureDetector {
    public float currAngle;
    public float focusX;
    public float focusY;
    public float initialAngle;
    public boolean isGestureAccepted;
    public boolean isInProgress;
    public final GestureController.InternalGesturesListener listener;
    public float prevAngle;

    public RotationGestureDetector(GestureController.InternalGesturesListener internalGesturesListener) {
        this.listener = internalGesturesListener;
    }

    public final void cancelRotation() {
        if (this.isInProgress) {
            this.isInProgress = false;
            if (this.isGestureAccepted) {
                GestureController gestureController = GestureController.this;
                if (gestureController.isRotationDetected) {
                    gestureController.exitController.isRotationInAction = false;
                }
                gestureController.isRotationDetected = false;
                gestureController.isRestrictRotationRequested = true;
                this.isGestureAccepted = false;
            }
        }
    }
}
