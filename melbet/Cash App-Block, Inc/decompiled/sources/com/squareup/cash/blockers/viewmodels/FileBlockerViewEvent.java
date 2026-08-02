package com.squareup.cash.blockers.viewmodels;

import app.cash.broadway.screen.Screen;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.HelpItem;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class FileBlockerViewEvent {

    public final class BlockerActionClick extends FileBlockerViewEvent {
        public final BlockerAction action;

        public BlockerActionClick(BlockerAction blockerAction) {
            this.action = blockerAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BlockerActionClick) && this.action.equals(((BlockerActionClick) obj).action);
        }

        public final int hashCode() {
            return this.action.hashCode();
        }

        public final String toString() {
            return Matcher$$ExternalSyntheticOutline0.m("BlockerActionClick(action=", this.action, ")");
        }
    }

    public final class CameraAccessGranted extends FileBlockerViewEvent {
        public static final CameraAccessGranted INSTANCE = new CameraAccessGranted();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CameraAccessGranted);
        }

        public final int hashCode() {
            return 416373335;
        }

        public final String toString() {
            return "CameraAccessGranted";
        }
    }

    public final class CaptureCompleted extends FileBlockerViewEvent {
        public final Lazy captures;

        public CaptureCompleted(Lazy lazy) {
            lazy.getClass();
            this.captures = lazy;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CaptureCompleted) && Intrinsics.areEqual(this.captures, ((CaptureCompleted) obj).captures);
        }

        public final int hashCode() {
            return this.captures.hashCode();
        }

        public final String toString() {
            return "CaptureCompleted(captures=" + this.captures + ")";
        }
    }

    public final class HelpItemClick extends FileBlockerViewEvent {
        public final HelpItem helpItem;

        public HelpItemClick(HelpItem helpItem) {
            helpItem.getClass();
            this.helpItem = helpItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HelpItemClick) && Intrinsics.areEqual(this.helpItem, ((HelpItemClick) obj).helpItem);
        }

        public final int hashCode() {
            return this.helpItem.hashCode();
        }

        public final String toString() {
            return "HelpItemClick(helpItem=" + this.helpItem + ")";
        }
    }

    public abstract class NavigationAction extends FileBlockerViewEvent {

        public final class BlockerError extends NavigationAction {
            public final Screen screenArgs;

            public BlockerError(Screen screen) {
                screen.getClass();
                this.screenArgs = screen;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof BlockerError) && Intrinsics.areEqual(this.screenArgs, ((BlockerError) obj).screenArgs);
            }

            public final int hashCode() {
                return this.screenArgs.hashCode();
            }

            public final String toString() {
                return re$$ExternalSyntheticOutline0.m(this.screenArgs, "BlockerError(screenArgs=", ")");
            }
        }

        public final class CameraAccessDenied extends NavigationAction {
            public static final CameraAccessDenied INSTANCE = new CameraAccessDenied();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof CameraAccessDenied);
            }

            public final int hashCode() {
                return 718103501;
            }

            public final String toString() {
                return "CameraAccessDenied";
            }
        }

        public final class CameraAccessDeniedForever extends NavigationAction {
            public static final CameraAccessDeniedForever INSTANCE = new CameraAccessDeniedForever();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof CameraAccessDeniedForever);
            }

            public final int hashCode() {
                return 51541210;
            }

            public final String toString() {
                return "CameraAccessDeniedForever";
            }
        }

        public final class CameraError extends NavigationAction {
            public static final CameraError INSTANCE = new CameraError();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof CameraError);
            }

            public final int hashCode() {
                return -296658918;
            }

            public final String toString() {
                return "CameraError";
            }
        }

        public final class Exit extends NavigationAction {
            public static final Exit INSTANCE = new Exit();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Exit);
            }

            public final int hashCode() {
                return 541372103;
            }

            public final String toString() {
                return "Exit";
            }
        }

        public final class FileBlockerExplanationCanceled extends NavigationAction {
            public static final FileBlockerExplanationCanceled INSTANCE = new FileBlockerExplanationCanceled();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof FileBlockerExplanationCanceled);
            }

            public final int hashCode() {
                return 2134663293;
            }

            public final String toString() {
                return "FileBlockerExplanationCanceled";
            }
        }

        public final class HelpClick extends NavigationAction {
            public static final HelpClick INSTANCE = new HelpClick();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof HelpClick);
            }

            public final int hashCode() {
                return 1273336510;
            }

            public final String toString() {
                return "HelpClick";
            }
        }
    }

    public final class RestartCapture extends FileBlockerViewEvent {
        public static final RestartCapture INSTANCE = new RestartCapture();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RestartCapture);
        }

        public final int hashCode() {
            return -1532013998;
        }

        public final String toString() {
            return "RestartCapture";
        }
    }
}
