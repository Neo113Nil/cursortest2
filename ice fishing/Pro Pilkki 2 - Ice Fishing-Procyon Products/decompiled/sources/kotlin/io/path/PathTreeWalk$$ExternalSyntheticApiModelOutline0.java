package kotlin.io.path;

import android.app.NotificationChannel;
import android.view.PixelCopy;
import android.view.PixelCopy$OnPixelCopyFinishedListener;
import android.view.contentcapture.ContentCaptureSession;
import android.view.inputmethod.InputContentInfo;
import dalvik.system.DelegateLastClassLoader;
import java.nio.file.FileSystemException;
import java.nio.file.FileSystemLoopException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;

/* JADX INFO: compiled from: D8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class PathTreeWalk$$ExternalSyntheticApiModelOutline0 {
    public static /* synthetic */ NotificationChannel m(String str, CharSequence charSequence, int i) {
        return new NotificationChannel(str, charSequence, i);
    }

    public static /* bridge */ /* synthetic */ PixelCopy$OnPixelCopyFinishedListener m(Object obj) {
        return (PixelCopy$OnPixelCopyFinishedListener) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ PixelCopy.Result m1424m(Object obj) {
        return (PixelCopy.Result) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ ContentCaptureSession m1425m(Object obj) {
        return (ContentCaptureSession) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ InputContentInfo m1426m(Object obj) {
        return (InputContentInfo) obj;
    }

    public static /* synthetic */ DelegateLastClassLoader m(String str, ClassLoader classLoader) {
        return new DelegateLastClassLoader(str, classLoader);
    }

    public static /* bridge */ /* synthetic */ Class m() {
        return BasicFileAttributes.class;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ FileSystemException m1432m(Object obj) {
        return (FileSystemException) obj;
    }

    public static /* synthetic */ FileSystemException m(String str) {
        return new FileSystemException(str);
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ FileSystemLoopException m1433m(String str) {
        return new FileSystemLoopException(str);
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ FileVisitResult m1436m(Object obj) {
        return (FileVisitResult) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ FileVisitor m1437m(Object obj) {
        return (FileVisitor) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ Path m1439m(Object obj) {
        return (Path) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ void m1444m() {
    }

    public static /* bridge */ /* synthetic */ Class m$1() {
        return BasicFileAttributeView.class;
    }

    /* JADX INFO: renamed from: m$1, reason: collision with other method in class */
    public static /* synthetic */ void m1450m$1() {
    }

    public static /* synthetic */ void m$2() {
    }
}
