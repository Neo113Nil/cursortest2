package ru.cprocsp.ACSP.tools.common;

import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.cprocsp.ACSP.tools.integrity.CSPIntegrityConstants;
import ru.cprocsp.ACSP.tools.license.CSPLicenseConstants;
import ru.cprocsp.ACSP.tools.license.LicenseConstants;
import ru.cprocsp.ACSP.tools.log.LogConstants;

/* loaded from: classes4.dex */
public interface Constants extends CSPDirectoryConstants, CSPLicenseConstants, CSPIntegrityConstants, ConfigConstants, LicenseConstants, LogConstants {
    public static final String CSP_APP_PACKET_NAME = "ru.cprocsp.ACSP";
    public static final int CSP_INIT_APP_CONTEXT = 10;
    public static final int CSP_INIT_CHANGE_WORK_DIR = 4;
    public static final int CSP_INIT_CONTEXT = 1;
    public static final int CSP_INIT_COPY_RESOURCES = 3;
    public static final int CSP_INIT_CREATE_INFRASTRUCTURE = 2;
    public static final int CSP_INIT_CSP_NOT_FOUND = 11;
    public static final int CSP_INIT_INVALID_INTEGRITY = 8;
    public static final int CSP_INIT_INVALID_INTEGRITY_CHECK = 12;
    public static final int CSP_INIT_INVALID_LICENSE = 5;
    public static final int CSP_INIT_LICENSE = 13;
    public static final int CSP_INIT_OK = 0;
    public static final int CSP_INIT_UNKNOWN = -1;
    public static final int CSP_INIT_UNSUPPORTED = 9;
    public static final int CSP_STORE_LIBRARY_PATH = 7;
    public static final int CSP_TRUST_STORE_FAILED = 6;
    public static final String INTEGRITY_RESULT_FILE = "integrity.prop";
}
