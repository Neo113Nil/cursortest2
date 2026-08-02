package com.google.i18n.phonenumbers.metadata.init;

import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class ClassPathResourceMetadataLoader {
    public static final Logger logger = Logger.getLogger(ClassPathResourceMetadataLoader.class.getName());

    public static InputStream loadMetadata(String str) {
        InputStream resourceAsStream = ClassPathResourceMetadataLoader.class.getResourceAsStream(str);
        if (resourceAsStream == null) {
            logger.log(Level.WARNING, "File " + str + " not found");
        }
        return resourceAsStream;
    }
}
