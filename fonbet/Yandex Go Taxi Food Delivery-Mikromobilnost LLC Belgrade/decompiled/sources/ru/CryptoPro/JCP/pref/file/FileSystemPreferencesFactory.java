package ru.CryptoPro.JCP.pref.file;

import java.io.File;
import java.security.AccessController;
import java.util.prefs.Preferences;
import java.util.prefs.PreferencesFactory;
import ru.CryptoPro.JCP.pref.file.FileSystemPreferences;

/* loaded from: classes4.dex */
public class FileSystemPreferencesFactory implements PreferencesFactory {
    @Override // java.util.prefs.PreferencesFactory
    public Preferences systemRoot() {
        Preferences preferences;
        File file = FileSystemPreferences.i;
        synchronized (FileSystemPreferences.class) {
            try {
                if (FileSystemPreferences.m == null) {
                    AccessController.doPrivileged(new FileSystemPreferences.AnonymousClass2());
                    FileSystemPreferences.m = new FileSystemPreferences(false);
                }
                preferences = FileSystemPreferences.m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return preferences;
    }

    @Override // java.util.prefs.PreferencesFactory
    public Preferences userRoot() {
        Preferences preferences;
        File file = FileSystemPreferences.i;
        synchronized (FileSystemPreferences.class) {
            try {
                if (FileSystemPreferences.l == null) {
                    AccessController.doPrivileged(new FileSystemPreferences.AnonymousClass1());
                    FileSystemPreferences.l = new FileSystemPreferences(true);
                }
                preferences = FileSystemPreferences.l;
            } catch (Throwable th) {
                throw th;
            }
        }
        return preferences;
    }
}
