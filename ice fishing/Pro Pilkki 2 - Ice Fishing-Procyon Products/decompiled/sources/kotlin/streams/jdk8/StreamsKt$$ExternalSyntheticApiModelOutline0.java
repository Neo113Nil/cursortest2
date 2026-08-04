package kotlin.streams.jdk8;

import java.nio.file.DirectoryStream;
import java.nio.file.FileSystemException;
import java.nio.file.NoSuchFileException;
import java.nio.file.SecureDirectoryStream;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttributeView;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.function.BiFunction;

/* JADX INFO: compiled from: D8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class StreamsKt$$ExternalSyntheticApiModelOutline0 {
    public static /* bridge */ /* synthetic */ Class m() {
        return FileAttributeView.class;
    }

    public static /* bridge */ /* synthetic */ DirectoryStream m(Object obj) {
        return (DirectoryStream) obj;
    }

    public static /* synthetic */ FileSystemException m(String str, String str2, String str3) {
        return new FileSystemException(str, str2, str3);
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ NoSuchFileException m1537m(String str, String str2, String str3) {
        return new NoSuchFileException(str, str2, str3);
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ SecureDirectoryStream m1539m(Object obj) {
        return (SecureDirectoryStream) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ BasicFileAttributeView m1541m(Object obj) {
        return (BasicFileAttributeView) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ BasicFileAttributes m1542m(Object obj) {
        return (BasicFileAttributes) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ FileAttributeView m1543m(Object obj) {
        return (FileAttributeView) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ CompletableFuture m1550m() {
        return new CompletableFuture();
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ CompletionException m1551m(Object obj) {
        return (CompletionException) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ BiFunction m1552m(Object obj) {
        return (BiFunction) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ void m1554m() {
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ boolean m1557m(Object obj) {
        return obj instanceof SecureDirectoryStream;
    }

    public static /* bridge */ /* synthetic */ boolean m$1(Object obj) {
        return obj instanceof CompletionException;
    }
}
