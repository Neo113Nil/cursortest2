package com.connectsdk.discovery.provider.ssdp;

import defpackage.ouj;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;

/* loaded from: classes.dex */
public class SSDPDevice {
    public String ST;
    public String UDN;
    public String UUID;
    public String applicationURL;
    public String baseURL;
    public String deviceType;
    public String friendlyName;
    public Map<String, List<String>> headers;
    public String ipAddress;
    public String locationXML;
    public String manufacturer;
    public String modelDescription;
    public String modelName;
    public String modelNumber;
    public int port;
    public List<Service> serviceList;
    public String serviceURI;

    public SSDPDevice(URL url, String str) throws IOException, ParserConfigurationException, SAXException {
        this.serviceList = new ArrayList();
        if (url.getPort() == -1) {
            this.baseURL = ouj.o(url.getProtocol(), "://", url.getHost());
        } else {
            this.baseURL = String.format("%s://%s:%d", url.getProtocol(), url.getHost(), Integer.valueOf(url.getPort()));
        }
        this.ipAddress = url.getHost();
        this.port = url.getPort();
        this.UUID = null;
        this.serviceURI = ouj.o(url.getProtocol(), "://", url.getHost());
        parse(url);
    }

    public void parse(URL url) throws IOException, ParserConfigurationException, SAXException {
        SAXParserFactory newInstance = SAXParserFactory.newInstance();
        SSDPDeviceDescriptionParser sSDPDeviceDescriptionParser = new SSDPDeviceDescriptionParser(this);
        URLConnection openConnection = url.openConnection();
        String headerField = openConnection.getHeaderField("Application-URL");
        this.applicationURL = headerField;
        if (headerField != null && !headerField.substring(headerField.length() - 1).equals("/")) {
            this.applicationURL = this.applicationURL.concat("/");
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(openConnection.getInputStream());
        Scanner scanner = null;
        try {
            scanner = new Scanner(bufferedInputStream).useDelimiter("\\A");
            this.locationXML = scanner.hasNext() ? scanner.next() : "";
            newInstance.newSAXParser().parse(new ByteArrayInputStream(this.locationXML.getBytes()), sSDPDeviceDescriptionParser);
            bufferedInputStream.close();
            scanner.close();
            this.headers = openConnection.getHeaderFields();
        } catch (Throwable th) {
            bufferedInputStream.close();
            if (scanner != null) {
                scanner.close();
            }
            throw th;
        }
    }

    public String toString() {
        return this.friendlyName;
    }

    public SSDPDevice(String str, String str2) throws IOException, ParserConfigurationException, SAXException {
        this(new URL(str), str2);
    }
}
