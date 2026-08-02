package ru.cprocsp.ACSP.tools.common;

import android.content.Context;
import android.content.res.Resources;
import defpackage.b64;
import defpackage.g8e;
import defpackage.oyr;
import defpackage.w511;
import java.io.File;
import java.io.InputStream;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.cprocsp.ACSP.tools.license.LicenseConstants;

/* loaded from: classes4.dex */
public class CSPTool implements IACSPContentProvider {
    private final Context appCtx;
    private final Infrastructure appInfrastructure;

    public CSPTool(Context context) {
        this.appCtx = context;
        this.appInfrastructure = new Infrastructure(context);
    }

    private void copyEtcResources(Context context, boolean z) throws Exception {
        if (context == null) {
            w511.s("Source context not found.");
            return;
        }
        Infrastructure infrastructure = new Infrastructure(context);
        copyOneEtcResource(context, infrastructure.getConfigFile(), this.appInfrastructure.getEtcDirectory(), "raw/config", Infrastructure.isIsCspLib64() ? ConfigConstants.CONFIG64 : ConfigConstants.CONFIG, z);
        copyOneEtcResource(context, infrastructure.getLicenseFile(), this.appInfrastructure.getEtcDirectory(), "raw/license", LicenseConstants.LICENSE, false);
    }

    private void copyOneEtcResource(Context context, String str, String str2, String str3, String str4, boolean z) throws Exception {
        String j = b64.j(str4, ".ini");
        File file = new File(str);
        if (file.exists() && !z) {
            if (theSameFile(file, j)) {
                return;
            }
            copyOneResource(file, j);
            return;
        }
        File file2 = new File(str2);
        if (!new File(file2, j).exists() || z) {
            int identifier = context.getResources().getIdentifier(str3, null, context.getPackageName());
            if (identifier == 0) {
                throw new Exception(g8e.o("Couldn't resolve resource ", str3));
            }
            InputStream openRawResource = context.getResources().openRawResource(identifier);
            if (file2.exists() || file2.mkdirs()) {
                copyOneResource(openRawResource, str2, j);
                return;
            }
            throw new Exception("Couldn't make directory " + file2.getAbsolutePath());
        }
    }

    private void copyOneResource(InputStream inputStream, String str, String str2) throws Exception {
        if (inputStream == null) {
            w511.s("Couldn't open stream.");
        } else if (!RawResource.writeStreamToFile(inputStream, str, str2)) {
            throw new Exception(b64.l("Couldn't copy file ", str2, " to ", str));
        }
    }

    private boolean theSameFile(File file, String str) throws Exception {
        if (file == null) {
            w511.s("Resource is null.");
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.appInfrastructure.getEtcDirectory());
        return file.getAbsolutePath().equalsIgnoreCase(oyr.t(sb, File.separator, str));
    }

    public void copyResource(int i, String str, boolean z) throws Exception {
        if (!createRawResource(CSPDirectoryConstants.SUBDIRECTORY_ETC).copy(i, str, z)) {
            throw new Exception(oyr.k(i, "Couldn't copy resource ", " to file ", str));
        }
    }

    public void copySystemStores() throws Exception {
        Resources resources;
        int identifier;
        String storesDirectory = new Infrastructure(this.appCtx).getStoresDirectory();
        File file = new File(storesDirectory);
        File file2 = new File(file, CSPDirectoryConstants.FILE_USERS_STORES_ROOT);
        if ((!file2.exists() || file2.length() == 0) && (identifier = (resources = this.appCtx.getResources()).getIdentifier("raw/root", null, this.appCtx.getPackageName())) != 0) {
            if (file.exists() || file.mkdirs()) {
                if (!RawResource.writeStreamToFile(resources.openRawResource(identifier), storesDirectory, CSPDirectoryConstants.FILE_USERS_STORES_ROOT)) {
                    throw new Exception(g8e.n(file, "Couldn't copy file root.sto to "));
                }
            } else {
                throw new Exception("Couldn't make directory " + file.getAbsolutePath());
            }
        }
    }

    public void createInfrastructure() throws Exception {
        if (this.appInfrastructure.create()) {
            return;
        }
        w511.s("Couldn't create CSP hierarchy.");
    }

    public RawResource createRawResource(int i, String str) {
        Context context = this.appCtx;
        return i != 0 ? new RawResource(context, CSPDirectoryConstants.DIRECTORY_CPROCSP, str) : new RawResource(context, CSPDirectoryConstants.DIRECTORY_CPROCSP, oyr.t(new StringBuilder(CSPDirectoryConstants.SUBDIRECTORY_KEYS), File.separator, str));
    }

    public Infrastructure getAppInfrastructure() {
        return this.appInfrastructure;
    }

    private void copyOneResource(File file, String str) throws Exception {
        if (!RawResource.writeStreamToFile(file, this.appInfrastructure.getEtcDirectory(), str)) {
            throw new Exception(g8e.o("Couldn't copy resource ", str));
        }
    }

    public RawResource createRawResource(String str) {
        return new RawResource(this.appCtx, CSPDirectoryConstants.DIRECTORY_CPROCSP, str);
    }

    public RawResource createRawResource(String str, String str2) {
        return new RawResource(this.appCtx, str, str2);
    }

    public void copyEtcResources(boolean z) throws Exception {
        copyEtcResources(this.appCtx, z);
    }
}
