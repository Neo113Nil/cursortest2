package ru.cprocsp.ACSP.tools.common;

import android.content.ContentResolver;
import android.util.Log;
import defpackage.oyr;
import defpackage.qv10;
import defpackage.yzl;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import ru.cprocsp.ACSP.tools.log.LogConstants;

/* loaded from: classes4.dex */
public class InfrastructureUtility implements LogConstants {
    public static void copyContainerFromArchive(Infrastructure infrastructure, int i) {
        String userDirUid = infrastructure.getUserDirUid();
        StringBuilder sb = new StringBuilder();
        sb.append(infrastructure.getKeysDirectory());
        String t = oyr.t(sb, File.separator, userDirUid);
        InputStream inputStream = null;
        try {
            try {
                try {
                    InputStream openRawResource = infrastructure.getApplicationContext().getResources().openRawResource(i);
                    ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(openRawResource));
                    while (true) {
                        ZipEntry nextEntry = zipInputStream.getNextEntry();
                        if (nextEntry == null) {
                            zipInputStream.close();
                            if (openRawResource != null) {
                                openRawResource.close();
                                return;
                            }
                            return;
                        }
                        String name = nextEntry.getName();
                        if (nextEntry.isDirectory()) {
                            makeDirectory(t, name);
                        } else {
                            String extractDirectoryFromPath = extractDirectoryFromPath(name);
                            if (extractDirectoryFromPath != null) {
                                makeDirectory(t, extractDirectoryFromPath);
                            }
                            if (!extractFile(zipInputStream, t, name)) {
                                throw new Exception("Couldn't copy file: " + name);
                            }
                        }
                    }
                } catch (Throwable th) {
                    if (0 != 0) {
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                        }
                    }
                    throw th;
                }
            } catch (Exception e) {
                Log.e(LogConstants.APP_LOGGER_TAG, e.getMessage(), e);
                if (0 != 0) {
                    inputStream.close();
                }
            }
        } catch (IOException unused2) {
        }
    }

    public static boolean copyContainerFromDirectory(Infrastructure infrastructure, yzl yzlVar, ContentResolver contentResolver, StringBuilder sb) {
        sb.append(infrastructure.getKeysDirectory());
        sb.append(File.separator);
        sb.append(infrastructure.getUserDirUid());
        throw null;
    }

    private static String extractDirectoryFromPath(String str) {
        int lastIndexOf = str.lastIndexOf(File.separatorChar);
        if (lastIndexOf == -1) {
            return null;
        }
        return str.substring(0, lastIndexOf);
    }

    private static boolean extractFile(InputStream inputStream, String str, String str2) {
        Log.i(LogConstants.APP_LOGGER_TAG, "Install container " + str2 + " to key directory " + str);
        byte[] bArr = new byte[1048576];
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(str + File.separator + str2);
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, read);
                    } catch (Exception e) {
                        e = e;
                        fileOutputStream = fileOutputStream2;
                        Log.e(LogConstants.APP_LOGGER_TAG, e.getMessage(), e);
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                }
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
                return true;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    private static boolean makeDirectory(String str, String str2) {
        return new File(oyr.t(qv10.t(str), File.separator, str2)).mkdirs();
    }
}
